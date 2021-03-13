# Package required only by gpredict.
SUMMARY = "goocanvas"

DESCRIPTION = "GooCanvas is a canvas widget for GTK+ that uses the cairo 2D \
library for drawing."

HOMEPAGE = "https://wiki.gnome.org/Projects/GooCanvas"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=3bf50002aefd002f49e7bb854063f7e7"

SRC_URI = "http://ftp.gnome.org/pub/GNOME/sources/goocanvas/2.0/goocanvas-2.0.4.tar.xz \
          "
SRC_URI[md5sum] = "a603f9459d29348b88ba3592bca03274"
SRC_URI[sha256sum] = "c728e2b7d4425ae81b54e1e07a3d3c8a4bd6377a63cffa43006045bceaa92e90"

inherit autotools gettext gtk-doc gobject-introspection

DEPENDS = "cairo gtk+3"
