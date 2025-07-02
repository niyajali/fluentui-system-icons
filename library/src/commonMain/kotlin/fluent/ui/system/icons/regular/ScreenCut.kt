/*
 * MIT License
 *
 * Copyright (c) 2020 Microsoft Corporation
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package fluent.ui.system.icons.regular

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

/**
 * ScreenCut icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: screen, cut
 * - Source: ic_fluent_screen_cut_20_regular.svg
 * 
 * @return The [ImageVector] for the ScreenCut icon.
 */
public val FluentIcons.Regular.ScreenCut: ImageVector
    get() {
        if (_screenCut != null) {
            return _screenCut!!
        }
        _screenCut = Builder(name = "ScreenCut", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 4.996f)
                curveTo(3.448f, 4.996f, 3.0f, 5.444f, 3.0f, 5.996f)
                verticalLineTo(6.496f)
                curveTo(3.0f, 6.772f, 2.776f, 6.996f, 2.5f, 6.996f)
                curveTo(2.224f, 6.996f, 2.0f, 6.772f, 2.0f, 6.496f)
                verticalLineTo(5.996f)
                curveTo(2.0f, 4.892f, 2.895f, 3.996f, 4.0f, 3.996f)
                horizontalLineTo(4.5f)
                curveTo(4.776f, 3.996f, 5.0f, 4.22f, 5.0f, 4.496f)
                curveTo(5.0f, 4.772f, 4.776f, 4.996f, 4.5f, 4.996f)
                horizontalLineTo(4.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 13.004f)
                curveTo(3.0f, 13.556f, 3.448f, 14.004f, 4.0f, 14.004f)
                horizontalLineTo(4.25f)
                curveTo(4.526f, 14.004f, 4.75f, 14.227f, 4.75f, 14.504f)
                curveTo(4.75f, 14.78f, 4.526f, 15.004f, 4.25f, 15.004f)
                horizontalLineTo(4.0f)
                curveTo(2.895f, 15.004f, 2.0f, 14.108f, 2.0f, 13.004f)
                verticalLineTo(12.504f)
                curveTo(2.0f, 12.227f, 2.224f, 12.004f, 2.5f, 12.004f)
                curveTo(2.776f, 12.004f, 3.0f, 12.227f, 3.0f, 12.504f)
                verticalLineTo(13.004f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 8.5f)
                curveTo(3.0f, 8.224f, 2.776f, 8.0f, 2.5f, 8.0f)
                curveTo(2.224f, 8.0f, 2.0f, 8.224f, 2.0f, 8.5f)
                verticalLineTo(10.5f)
                curveTo(2.0f, 10.776f, 2.224f, 11.0f, 2.5f, 11.0f)
                curveTo(2.776f, 11.0f, 3.0f, 10.776f, 3.0f, 10.5f)
                lineTo(3.0f, 8.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 4.996f)
                curveTo(16.552f, 4.996f, 17.0f, 5.444f, 17.0f, 5.996f)
                verticalLineTo(6.496f)
                curveTo(17.0f, 6.772f, 17.224f, 6.996f, 17.5f, 6.996f)
                curveTo(17.776f, 6.996f, 18.0f, 6.772f, 18.0f, 6.496f)
                verticalLineTo(5.996f)
                curveTo(18.0f, 4.892f, 17.105f, 3.996f, 16.0f, 3.996f)
                horizontalLineTo(15.5f)
                curveTo(15.224f, 3.996f, 15.0f, 4.22f, 15.0f, 4.496f)
                curveTo(15.0f, 4.772f, 15.224f, 4.996f, 15.5f, 4.996f)
                horizontalLineTo(16.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 14.004f)
                curveTo(16.552f, 14.004f, 17.0f, 13.556f, 17.0f, 13.004f)
                verticalLineTo(12.504f)
                curveTo(17.0f, 12.227f, 17.224f, 12.004f, 17.5f, 12.004f)
                curveTo(17.776f, 12.004f, 18.0f, 12.227f, 18.0f, 12.504f)
                verticalLineTo(13.004f)
                curveTo(18.0f, 14.108f, 17.105f, 15.004f, 16.0f, 15.004f)
                horizontalLineTo(15.748f)
                curveTo(15.472f, 15.004f, 15.248f, 14.78f, 15.248f, 14.504f)
                curveTo(15.248f, 14.227f, 15.472f, 14.004f, 15.748f, 14.004f)
                horizontalLineTo(16.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.5f, 8.0f)
                curveTo(17.224f, 8.0f, 17.0f, 8.224f, 17.0f, 8.5f)
                verticalLineTo(10.5f)
                curveTo(17.0f, 10.776f, 17.224f, 11.0f, 17.5f, 11.0f)
                curveTo(17.776f, 11.0f, 18.0f, 10.776f, 18.0f, 10.5f)
                verticalLineTo(8.5f)
                curveTo(18.0f, 8.224f, 17.776f, 8.0f, 17.5f, 8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.5f, 3.996f)
                curveTo(6.224f, 3.996f, 6.0f, 4.22f, 6.0f, 4.496f)
                curveTo(6.0f, 4.772f, 6.224f, 4.996f, 6.5f, 4.996f)
                horizontalLineTo(9.0f)
                curveTo(9.276f, 4.996f, 9.5f, 4.772f, 9.5f, 4.496f)
                curveTo(9.5f, 4.22f, 9.276f, 3.996f, 9.0f, 3.996f)
                horizontalLineTo(6.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.5f, 4.496f)
                curveTo(10.5f, 4.22f, 10.724f, 3.996f, 11.0f, 3.996f)
                horizontalLineTo(13.5f)
                curveTo(13.776f, 3.996f, 14.0f, 4.22f, 14.0f, 4.496f)
                curveTo(14.0f, 4.772f, 13.776f, 4.996f, 13.5f, 4.996f)
                horizontalLineTo(11.0f)
                curveTo(10.724f, 4.996f, 10.5f, 4.772f, 10.5f, 4.496f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.216f, 8.087f)
                curveTo(6.985f, 8.24f, 6.923f, 8.549f, 7.076f, 8.779f)
                lineTo(9.395f, 12.257f)
                lineTo(8.157f, 14.114f)
                curveTo(7.716f, 13.961f, 7.219f, 13.961f, 6.752f, 14.149f)
                curveTo(5.727f, 14.563f, 5.232f, 15.729f, 5.646f, 16.753f)
                curveTo(6.06f, 17.777f, 7.226f, 18.272f, 8.251f, 17.858f)
                curveTo(9.276f, 17.444f, 9.771f, 16.279f, 9.357f, 15.255f)
                curveTo(9.267f, 15.033f, 9.142f, 14.835f, 8.99f, 14.667f)
                lineTo(9.996f, 13.159f)
                lineTo(11.005f, 14.672f)
                curveTo(10.855f, 14.839f, 10.732f, 15.035f, 10.643f, 15.255f)
                curveTo(10.229f, 16.279f, 10.724f, 17.444f, 11.749f, 17.858f)
                curveTo(12.773f, 18.272f, 13.939f, 17.777f, 14.353f, 16.753f)
                curveTo(14.767f, 15.729f, 14.272f, 14.563f, 13.248f, 14.149f)
                curveTo(12.778f, 13.96f, 12.279f, 13.961f, 11.836f, 14.116f)
                lineTo(10.597f, 12.257f)
                lineTo(10.599f, 12.254f)
                lineTo(9.998f, 11.353f)
                lineTo(9.996f, 11.356f)
                lineTo(7.91f, 8.228f)
                curveTo(7.757f, 7.998f, 7.446f, 7.935f, 7.216f, 8.087f)
                close()
                moveTo(12.5f, 17.0f)
                curveTo(11.947f, 17.0f, 11.5f, 16.552f, 11.5f, 16.0f)
                curveTo(11.5f, 15.448f, 11.947f, 15.0f, 12.5f, 15.0f)
                curveTo(13.052f, 15.0f, 13.5f, 15.448f, 13.5f, 16.0f)
                curveTo(13.5f, 16.552f, 13.052f, 17.0f, 12.5f, 17.0f)
                close()
                moveTo(7.5f, 17.0f)
                curveTo(6.948f, 17.0f, 6.5f, 16.552f, 6.5f, 16.0f)
                curveTo(6.5f, 15.448f, 6.948f, 15.0f, 7.5f, 15.0f)
                curveTo(8.052f, 15.0f, 8.5f, 15.448f, 8.5f, 16.0f)
                curveTo(8.5f, 16.552f, 8.052f, 17.0f, 7.5f, 17.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.599f, 10.451f)
                lineTo(11.2f, 11.353f)
                lineTo(12.916f, 8.779f)
                curveTo(13.069f, 8.549f, 13.006f, 8.24f, 12.776f, 8.087f)
                curveTo(12.545f, 7.935f, 12.234f, 7.998f, 12.081f, 8.228f)
                lineTo(10.599f, 10.451f)
                close()
            }
        }
        .build()
        return _screenCut!!
    }

@Suppress("ObjectPropertyName")
private var _screenCut: ImageVector? = null

@Preview
@Composable
private fun ScreenCutPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ScreenCut, contentDescription = null)
    }
}

