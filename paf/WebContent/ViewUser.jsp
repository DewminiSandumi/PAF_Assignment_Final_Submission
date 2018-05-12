<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang=""><head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="description" content="4C Knowledge Admin">
    <meta content="width=device-width, initial-scale=1, user-scalable=no" name="viewport">
    
    <title>Admin - 4C Knowledge</title>
    <meta name="description" content="Admin is a material design and bootstrap based responsive dashboard template created mainly for admin and backend applications.">
    
  
    
    <!-- Google icon -->
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    
    <!-- Bootstrap css -->
    <link rel="stylesheet" type="text/css" href="assets/css/bootstrap.min.css">
    
    <!-- Propeller css -->
    <!-- build:[href] assets/css/ -->
    <link rel="stylesheet" type="text/css" href="assets/css/propeller.min.css">
    <!-- /build -->
    
    <!-- Propeller date time picker css-->
    <link rel="stylesheet" type="text/css" href="components/datetimepicker/css/bootstrap-datetimepicker.css">
    <link rel="stylesheet" type="text/css" href="components/datetimepicker/css/pmd-datetimepicker.css">
    
    <!-- Propeller theme css-->
    <link rel="stylesheet" type="text/css" href="themes/css/propeller-theme.css">
    
    <!-- Propeller admin theme css-->
    <link rel="stylesheet" type="text/css" href="themes/css/propeller-admin.css">
    
    </head>
    
    <body class="">
    <!-- Header Starts -->
    <!--Start Nav bar -->
    <nav class="navbar navbar-inverse navbar-fixed-top pmd-navbar pmd-z-depth">
    
        <div class="container-fluid">
            
            
            <div class="navbar-header">
                <a href="javascript:void(0);" data-target="basicSidebar" data-placement="left" data-position="slidepush" is-open="true" is-open-width="1200" class="btn btn-sm pmd-btn-fab pmd-btn-flat pmd-ripple-effect pull-left margin-r8 pmd-sidebar-toggle"><i class="material-icons md-light">menu</i></a>	
              <a href="home.jsp" class="navbar-brand">
                  4C Knowledge
              </a>
            </div>
        </div>
    
    </nav><!--End Nav bar -->
    <!-- Header Ends -->
    
    <!-- Sidebar Starts -->
    <div class="pmd-sidebar-overlay"></div>
    
    <!-- Left sidebar -->
    <aside id="basicSidebar" class="pmd-sidebar  sidebar-default pmd-sidebar-left bg-fill-darkblue sidebar-with-icons is-slidepush pmd-sidebar-left-fixed" role="navigation">
        <ul class="nav pmd-sidebar-nav">
            
            <!-- User info -->
            <li class="dropdown pmd-dropdown pmd-user-info visible-xs visible-md visible-sm visible-lg">
                <a aria-expanded="false" data-toggle="dropdown" class="btn-user dropdown-toggle media" data-sidebar="true" aria-expandedhref="javascript:void(0);">
                    <div class="media-left">
                        <img src="themes/images/user-icon.png" alt="New User">
                    </div>
                    <div class="media-body media-middle">Admin</div>
                    <div class="media-right media-middle"><i class="dic-more-vert dic"></i></div>
                </a>
                <div class="pmd-dropdown-menu-container"><div class="pmd-dropdown-menu-bg"></div><ul class="dropdown-menu pm-ini" style="display: none;">
                    <li><a href="login.html">Logout</a></li>
                </ul></div>
            </li><!-- End user info -->
            
            <li> 
                 
            </li>
            
            <li class="dropdown pmd-dropdown"> 
                <a aria-expanded="false" data-toggle="dropdown" class="btn-user dropdown-toggle media active" data-sidebar="true" href="javascript:void(0);">	
                    <i class="media-left media-middle"><svg version="1.1" x="0px" y="0px" width="18px" height="18.001px" viewBox="0 0 18 18.001" enable-background="new 0 0 18 18.001" xml:space="preserve">
    <path fill="#C9C8C8" d="M6.188,0.001C5.232,0.001,4.5,0.732,4.5,1.688c0,0.394,0.166,0.739,0.334,1.02L5.45,3.71
        c0.113,0.113,0.176,0.341,0.176,0.51v0.281c0,0.619-0.506,1.125-1.125,1.125H0.282c-0.169,0-0.281,0.112-0.281,0.281V17.72
        c0,0.168,0.112,0.281,0.281,0.281h4.219c0.619,0,1.125-0.506,1.125-1.125v-0.281c0-0.168-0.063-0.397-0.176-0.509
        c0,0-0.615-0.946-0.615-1.002C4.666,14.802,4.5,14.457,4.5,14.063c0-0.956,0.731-1.688,1.688-1.688s1.688,0.731,1.688,1.688
        c0,0.394-0.166,0.739-0.334,1.02l-0.616,1.002c-0.056,0.112-0.176,0.341-0.176,0.509v0.281c0,0.619,0.506,1.125,1.125,1.125h4.219
        c0.168,0,0.281-0.113,0.281-0.281V13.5c0-0.619,0.506-1.125,1.125-1.125h0.281c0.169,0,0.396,0.063,0.51,0.176
        c0,0,0.945,0.616,1.002,0.616c0.337,0.168,0.626,0.334,1.02,0.334c0.956,0,1.687-0.731,1.687-1.687c0-0.957-0.731-1.688-1.687-1.688
        c-0.394,0-0.738,0.166-1.02,0.334l-1.002,0.616c-0.113,0.056-0.341,0.176-0.51,0.176H13.5c-0.619,0-1.125-0.506-1.125-1.125V5.908
        c0-0.168-0.113-0.281-0.281-0.281H7.875c-0.619,0-1.125-0.506-1.125-1.125V4.221c0-0.168,0.063-0.397,0.176-0.51
        c0,0,0.616-0.945,0.616-1.001c0.168-0.281,0.334-0.626,0.334-1.02C7.875,0.733,7.144,0.002,6.188,0.001L6.188,0.001z"></path>
    </svg></i> 
                    <span class="media-body">Users</span>
                    <div class="media-right media-bottom"><i class="dic-more-vert dic"></i></div>
                </a> 
                <div class="pmd-dropdown-menu-container"><div class="pmd-dropdown-menu-bg"></div><ul class="dropdown-menu pm-ini" style="display: block;">
                    <li><a href="Admin.jsp" class="active">Add User</a></li>
    <li><a href="ViewUser.jsp" id="l0" class="active">View User</a></li>
                    
                    
         
                </ul></div>
            </li>
            <li class="dropdown pmd-dropdown"> 
                <a aria-expanded="true" data-toggle="dropdown" class="btn-user dropdown-toggle media" data-sidebar="true" href="javascript:void(0);">	
                    <i class="material-icons media-left pmd-sm">swap_calls</i> 
                    <span class="media-body">Admins</span>
                    <div class="media-right media-bottom"><i class="dic-more-vert dic"></i></div>
                </a> 
                <div class="pmd-dropdown-menu-container"><div class="pmd-dropdown-menu-bg"></div><ul class="dropdown-menu pm-ini" style="display: none;">
                    <!--li><a href="Admin.jsp">Add Admin</a></li-->
                    <li><a href="ViewUser.jsp" id="l1">View Admin</a></li>
                    <!--  li><a href="delete.jsp">Remove Admin</a></li-->
                    
                </ul></div>
            </li>
            
            <li class="dropdown pmd-dropdown"> 
                <a aria-expanded="false" data-toggle="dropdown" class="btn-user dropdown-toggle media" data-sidebar="true" href="javascript:void(0);">	
                    <i class="media-left media-middle"><svg version="1.1" x="0px" y="0px" width="14.187px" height="18px" viewBox="0 0 14.187 18" enable-background="new 0 0 14.187 18" xml:space="preserve">
    <path fill="#C9C8C8" d="M0,0v18h14.187V0H0z M3.121,3.293h2.023v4.767H3.121V3.293z M11.211,14.764H2.948v-2.022h8.263V14.764
        L11.211,14.764z M11.211,11.585H2.948V9.563h8.263V11.585L11.211,11.585z M11.211,8.407H7.455V6.385h3.756V8.407z M11.211,5.229
        H7.455V3.207h3.756V5.229z"></path>
    </svg></i>
                    <span class="media-body">Category</span>
                    <div class="media-right media-bottom"><i class="dic-more-vert dic"></i></div>
                </a> 
                <div class="pmd-dropdown-menu-container"><div class="pmd-dropdown-menu-bg"></div><ul class="dropdown-menu pm-ini" style="display: none;">
                    <li><a href="category.jsp">Add Category</a></li>
                    <li><a href="category.jsp#IL01">View Category</a></li>
    <li><a href="Delete.jsp">Delete Category</a></li>
                </ul></div>
            </li>
            <li class="dropdown pmd-dropdown"> 
                 
                
            </li>
    
            
            
            
            
            
        </ul>
    </aside><!-- End Left sidebar -->
    <!-- Sidebar Ends -->  
        
    <!--content area start-->
      <form id="ViewUser" action="viewUser.do" method="get">
    <div id="ViewUser" class="pmd-content content-area dashboard">
     <h2>Users</h2>
       <div class="pmd-card pmd-z-depth pmd-card-custom-view">
   
							<div class="table-responsive"> 
								<table cellspacing="0" cellpadding="0" class="table pmd-table" id="table-propeller">
									<thead>
										<tr>
											<th>First Name</th>
											<th>Last Name</th>
											<th>Mobile </th>
											<th>Telephone</th>
											<th>Current Address</th>
											<th>Permanent Address</th>
											<th>Email Address</th>
											<th>Interests</th>
											<th>User Type</th>
											<th></th>
										</tr>
									</thead>
									<tbody>
										
									</tbody>
								</table>
							</div>
						</div> 
    
    </div>
    <input type="submit" value="View User" class="btn btn-primary next"><!--end content area-->
    </form>
    
    
    <!-- Footer Starts -->
    <!--footer start-->
    
    <!--footer end-->
    <!-- Footer Ends -->
    
    <!-- Scripts Starts -->
    <script src="assets/js/jquery-1.12.2.min.js"></script>
    <script src="assets/js/bootstrap.min.js"></script>
    <script>
        $(document).ready(function() {
            var sPath=window.location.pathname;
            var sPage = sPath.substring(sPath.lastIndexOf('/') + 1);
            $(".pmd-sidebar-nav").each(function(){
                $(this).find("a[href='"+sPage+"']").parents(".dropdown").addClass("open");
                $(this).find("a[href='"+sPage+"']").parents(".dropdown").find('.dropdown-menu').css("display", "block");
                $(this).find("a[href='"+sPage+"']").parents(".dropdown").find('a.dropdown-toggle').addClass("active");
                $(this).find("a[href='"+sPage+"']").addClass("active");
            });
        });
    </script>
    <script type="text/javascript">
    (function() {
      "use strict";
      var toggles = document.querySelectorAll(".c-hamburger");
      for (var i = toggles.length - 1; i >= 0; i--) {
        var toggle = toggles[i];
        toggleHandler(toggle);
      };
      function toggleHandler(toggle) {
        toggle.addEventListener( "click", function(e) {
          e.preventDefault();
          (this.classList.contains("is-active") === true) ? this.classList.remove("is-active") : this.classList.add("is-active");
        });
      }
    
    })();
    </script>
    
    <script src="assets/js/propeller.min.js"></script> 
    
    <!-- Javascript for revenue progressbar animation effect-->
    <script>
        function progress(percent, $element) {
            var progressBarWidth = percent * $element.width() / 100;
            $element.find('.progress-bar').animate({ width: progressBarWidth }, 500);
        } 
        
        progress(50, $('.cash-progressbar'));
        progress(30, $('.card-progressbar'));
        progress(60, $('.wallet-progressbar'));
        progress(40, $('.credit-progressbar'));
        progress(10, $('.other-progressbar'));
    </script>
    <!-- Javascript for revenue progressbar animation effect-->	
    
    
    <!--circle chart-->
    <script src="themes/js/circles.min.js"></script>
   <script>
     
            var colors = [
                ['#dfe3e7', '#f79332'], ['#dfe3e7', '#f79332'], ['#dfe3e7', '#f79332'], ['#dfe3e7', '#2ab7ee'], ['#dfe3e7', '#00719d']
            ], circles = [];
            for (var i = 1; i <= 3; i++) {
                var child = document.getElementById('circles-' + i),
                    percentage = 10 + (i * 8);
    
                circles.push(Circles.create({
                    id:         child.id,
                    value:		percentage,
                    radius:     50,
                    width:      7,
                    colors:     colors[i - 1],
                     textClass:           'circles-text',
                      styleText:           true
                }));
            }
     
        </script>
    
    <!--staked column chart for payment-->
    <script src="themes/js/highcharts.js"></script>
    <script src="themes/js/highcharts-more.js"></script>
    
    <!-- Payment chart js-->
    <script>
    $(function paymentChart(){
        $('#payment-chart').highcharts({
            chart: {
                type: 'column'
            },
            colors: "#00719d,#2ab7ee".split(","),
            title: {
                text: 'Last 10 days comparison',
                style: {
                    color: "#4d575d",
                    fontSize: "14px",
                },
            },
            xAxis: {
                categories: ['9-7', '10-7', '11-7', '12-7', '13-7', '14-7', '15-7', '16-7', '17-7', '18-7']
            },
            yAxis: {
                min: 0,
                title: {
                        text: "Amount"
                },
                stackLabels: {
                        enabled: false,
                        style: {
                            fontWeight: 'bold',
                            color: (Highcharts.theme && Highcharts.theme.textColor) || 'black'
                        }
                    }
                },
            legend: {
                enabled: !0,
                align: "right",
                layout: "horizontal",
                labelFormatter: function() {
                    return this.name
                },
                borderColor: false,
                borderRadius: 0,
                navigation: {
                    activeColor: "#274b6d",
                    inactiveColor: "#CCC"
                },
                shadow: false,
                itemStyle: {
                    color: "#888888",
                    fontSize: "12px",
                    fontWeight: "normal"
                },
                itemHoverStyle: {
                    color: "#000"
                },
                itemHiddenStyle: {
                    color: "#CCC"
                },
                itemCheckboxStyle: {
                    position: "absolute"
                },
                symbolHeight: 10,
                symbolWidth: 10,
                symbolPadding: 5,
                verticalAlign: "bottom",
                x: 0,
                y: 0,
                title: {
                    style: {
                        fontWeight: "normal"
                    }
                }
            },
            tooltip: {
                headerFormat: '<b>{point.x}</b><br/>',
                pointFormat: '{series.name}: {point.y}<br/>Total: {point.stackTotal}',
                backgroundColor: '#ffffff',
                borderColor: '#f0f0f0',
                shadow: true
            },
            plotOptions: {
                column: {
                    stacking: 'normal',
                    dataLabels: {
                        enabled: false,
                        color: (Highcharts.theme && Highcharts.theme.dataLabelsColor) || 'white',
                        style: {
                            textShadow: '0 0 3px black'
                        }
                    }
                }
            },
             credits: {
                enabled: false,
            },
            series: [{
                name: 'Card',
                data: [25000, 50000, 75000, 75000, 60000, 70000, 10000, 2500, 5000, 25000]
            }, {
                name: 'Wallet',
                data: [75000, 50000, 25000, 25000, 30000, 30000, 90000, 25000, 3000, 50000]
            }]
            
        });
    });
    </script>
    
    <!--staked column chart for sms details-->
    <script>
    $( function smsChart() { 
        $('#sms-chart').highcharts({
            chart: {
                zoomType: 'none'
            },
            colors: "#e75c5c,#9159b8".split(","),
             title: {
                text: 'Last 7 days comparison',
                style: {
                    color: "#4d575d",
                    fontSize: "14px",
                },
            },
            xAxis: [{
                categories: ['3-7', '4-7', '5-7', '6-7', '7-7', '8-7', '9-7']
            }],
            yAxis: [{ // Primary yAxis
                labels: {
                    style: {
                        color: Highcharts.getOptions().colors[1]
                    }
                },
                title: {
                    text: 'User Count',
                    style: {
                        color: Highcharts.getOptions().colors[1]
                    }
                }
            }, { // Secondary yAxis
                title: {
                    text: 'Total Days',
                    style: {
                        color: Highcharts.getOptions().colors[0]
                    }
                },
                labels: {
                    style: {
                        color: Highcharts.getOptions().colors[0]
                    }
                },
                opposite: true
            }],
            legend: {
                enabled: !0,
                align: "right",
                layout: "horizontal",
                labelFormatter: function() {
                    return this.name
                },
                borderColor: false,
                borderRadius: 0,
                navigation: {
                    activeColor: "#274b6d",
                    inactiveColor: "#CCC"
                },
                shadow: false,
                itemStyle: {
                    color: "#888888",
                    fontSize: "12px",
                    fontWeight: "normal"
                },
                itemHoverStyle: {
                    color: "#000"
                },
                itemHiddenStyle: {
                    color: "#CCC"
                },
                itemCheckboxStyle: {
                    position: "absolute",
                    width: "12px",
                    height: "12px"
                },
                symbolHeight: 10,
                symbolWidth: 10,
                symbolPadding: 5,
                verticalAlign: "bottom",
                x: 0,
                y: 0,
                title: {
                    style: {
                        fontWeight: "normal"
                    }
                }
            },
    
            tooltip: {
                shared: true,
                backgroundColor: '#ffffff',
                borderColor: '#f0f0f0',
                shadow: true
            },
             credits: {
                enabled: false,
            },
    
            series: [{
                name: 'Total Days',
                type: 'spline',
                yAxis: 1,
                data: [49.9, 71.5, 106.4, 129.2, 144.0, 176.0, 135.6],
                tooltip: {
                    pointFormat: '<span style="font-weight: bold; color: {series.color}">{series.name}</span>: '
                }
            }, {
                name: 'Total Days error',
                type: 'errorbar',
                yAxis: 1,
                data: [[48, 51], [68, 73], [92, 110], [128, 136], [140, 150], [171, 179], [135, 143]],
                tooltip: {
                    pointFormat: '(error range: {point.low}-{point.high})<br/>'
                }
            }, {
                name: 'User Count',
                type: 'column',
                data: [7.0, 6.9, 9.5, 14.5, 18.2, 21.5, 25.2],
                tooltip: {
                    pointFormat: '<span style="font-weight: bold; color: {series.color}">{series.name}</span>: <b>{point.y:.1f}</b> '
                }
            }, {
                name: 'User Count error',
                type: 'errorbar',
                data: [[6, 8], [5.9, 7.6], [9.4, 10.4], [14.1, 15.9], [18.0, 20.1], [21.0, 24.0], [23.2, 25.3]],
                tooltip: {
                    pointFormat: '(error range: {point.low}-{point.high})<br/>'
                }
            }]
        });
    });
    </script>
    <!-- Scripts Ends -->
    <!-- Javascript for Datepicker -->
    <script type="text/javascript" language="javascript" src="components/datetimepicker/js/moment-with-locales.js"></script>
    <script type="text/javascript" language="javascript" src="components/datetimepicker/js/bootstrap-datetimepicker.js"></script>
    <script>
        // Linked date and time picker 
        // start date date and time picker 
        $('#datepicker-default').datetimepicker();
        $(".auto-update-year").html(new Date().getFullYear());
    </script> 
    
    
    </body></html>