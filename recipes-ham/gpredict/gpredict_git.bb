SUMMARY = "Gpredict"

DESCRIPTION = "Gpredict is a real-time satellite tracking and orbit prediction \
application. It can track a large number of satellites and display their \
position and other data in lists, tables, maps, and polar plots (radar view)."

HOMEPAGE = "http://gpredict.oz9aec.net/"

LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=892f569a555ba9c07a568a7c0c4fa63a"

SRC_URI = "git://github.com/csete/gpredict.git;protocol=git;branch=master \
          "
SRCREV = "aa5771036f078e8f5bafa958661ac98ad3ed8f32"
S = "${WORKDIR}/git"

inherit autotools-brokensep gettext pkgconfig

DEPENDS = "glib-2.0-native libtool-native intltool-native curl glib-2.0 goocanvas"

RSUGGESTS:${PN} = "ntpdate"
