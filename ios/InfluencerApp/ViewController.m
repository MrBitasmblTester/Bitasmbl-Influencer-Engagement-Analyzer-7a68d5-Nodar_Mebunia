#import <UIKit/UIKit.h>
#import <WebKit/WebKit.h>

@interface ViewController : UIViewController
@end

@implementation ViewController
- (void)viewDidLoad{
  [super viewDidLoad];
  WKWebView *wv = [[WKWebView alloc]initWithFrame:self.view.bounds];
  [self.view addSubview:wv];
  NSURL *url = [[NSBundle mainBundle] URLForResource:@"chart" withExtension:@"html" subdirectory:@"www"];
  [wv loadFileURL:url allowingReadAccessToURL:url];
}
@end
