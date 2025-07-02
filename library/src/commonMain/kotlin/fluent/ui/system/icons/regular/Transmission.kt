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
 * Transmission icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: transmission
 * - Source: ic_fluent_transmission_24_regular.svg
 * 
 * @return The [ImageVector] for the Transmission icon.
 */
public val FluentIcons.Regular.Transmission: ImageVector
    get() {
        if (_transmission != null) {
            return _transmission!!
        }
        _transmission = Builder(name = "Transmission", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(10.481f, 2.0f, 9.25f, 3.231f, 9.25f, 4.75f)
                curveTo(9.25f, 6.009f, 10.096f, 7.07f, 11.25f, 7.396f)
                verticalLineTo(11.25f)
                curveTo(11.25f, 11.664f, 11.586f, 12.0f, 12.0f, 12.0f)
                curveTo(12.414f, 12.0f, 12.75f, 11.664f, 12.75f, 11.25f)
                verticalLineTo(7.396f)
                curveTo(13.904f, 7.07f, 14.75f, 6.009f, 14.75f, 4.75f)
                curveTo(14.75f, 3.231f, 13.519f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(10.75f, 4.75f)
                curveTo(10.75f, 4.06f, 11.31f, 3.5f, 12.0f, 3.5f)
                curveTo(12.69f, 3.5f, 13.25f, 4.06f, 13.25f, 4.75f)
                curveTo(13.25f, 5.44f, 12.69f, 6.0f, 12.0f, 6.0f)
                curveTo(11.31f, 6.0f, 10.75f, 5.44f, 10.75f, 4.75f)
                close()
                moveTo(3.0f, 6.5f)
                curveTo(3.0f, 5.119f, 4.119f, 4.0f, 5.5f, 4.0f)
                curveTo(6.881f, 4.0f, 8.0f, 5.119f, 8.0f, 6.5f)
                verticalLineTo(10.0f)
                horizontalLineTo(10.25f)
                verticalLineTo(11.5f)
                horizontalLineTo(6.5f)
                verticalLineTo(6.5f)
                curveTo(6.5f, 5.948f, 6.052f, 5.5f, 5.5f, 5.5f)
                curveTo(4.948f, 5.5f, 4.5f, 5.948f, 4.5f, 6.5f)
                verticalLineTo(18.5f)
                curveTo(4.5f, 19.052f, 4.948f, 19.5f, 5.5f, 19.5f)
                curveTo(6.052f, 19.5f, 6.5f, 19.052f, 6.5f, 18.5f)
                verticalLineTo(13.5f)
                horizontalLineTo(11.0f)
                verticalLineTo(18.5f)
                curveTo(11.0f, 19.052f, 11.448f, 19.5f, 12.0f, 19.5f)
                curveTo(12.552f, 19.5f, 13.0f, 19.052f, 13.0f, 18.5f)
                verticalLineTo(13.5f)
                horizontalLineTo(19.0f)
                curveTo(19.276f, 13.5f, 19.5f, 13.276f, 19.5f, 13.0f)
                verticalLineTo(6.5f)
                curveTo(19.5f, 5.948f, 19.052f, 5.5f, 18.5f, 5.5f)
                curveTo(17.948f, 5.5f, 17.5f, 5.948f, 17.5f, 6.5f)
                verticalLineTo(11.5f)
                horizontalLineTo(13.75f)
                verticalLineTo(10.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(6.5f)
                curveTo(16.0f, 5.119f, 17.119f, 4.0f, 18.5f, 4.0f)
                curveTo(19.881f, 4.0f, 21.0f, 5.119f, 21.0f, 6.5f)
                verticalLineTo(13.0f)
                curveTo(21.0f, 14.105f, 20.105f, 15.0f, 19.0f, 15.0f)
                horizontalLineTo(14.5f)
                verticalLineTo(18.5f)
                curveTo(14.5f, 19.881f, 13.381f, 21.0f, 12.0f, 21.0f)
                curveTo(10.619f, 21.0f, 9.5f, 19.881f, 9.5f, 18.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(18.5f)
                curveTo(8.0f, 19.881f, 6.881f, 21.0f, 5.5f, 21.0f)
                curveTo(4.119f, 21.0f, 3.0f, 19.881f, 3.0f, 18.5f)
                verticalLineTo(6.5f)
                close()
            }
        }
        .build()
        return _transmission!!
    }

@Suppress("ObjectPropertyName")
private var _transmission: ImageVector? = null

@Preview
@Composable
private fun TransmissionPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Transmission, contentDescription = null)
    }
}

