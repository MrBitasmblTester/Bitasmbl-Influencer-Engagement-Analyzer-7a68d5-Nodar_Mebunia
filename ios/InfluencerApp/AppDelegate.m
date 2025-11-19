#import <UIKit/UIKit.h>
#import "ViewController.h"

@interface AppDelegate : UIResponder <UIApplicationDelegate>
@property UIWindow *window;
@end

@implementation AppDelegate
- (BOOL)application:(UIApplication*)application didFinishLaunchingWithOptions:(NSDictionary*)opts{
  self.window = [[UIWindow alloc]initWithFrame:[[UIScreen mainScreen]bounds]];
  self.window.rootViewController = [ViewController new];
  [self.window makeKeyAndVisible];
  return YES;
}
@end
