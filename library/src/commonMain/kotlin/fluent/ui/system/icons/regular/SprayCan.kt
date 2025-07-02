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
 * SprayCan icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 16dp
 * - Keywords: spray, can
 * - Source: ic_fluent_spray_can_16_regular.svg
 * 
 * @return The [ImageVector] for the SprayCan icon.
 */
public val FluentIcons.Regular.SprayCan: ImageVector
    get() {
        if (_sprayCan != null) {
            return _sprayCan!!
        }
        _sprayCan = Builder(name = "SprayCan", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.5f, 4.0f)
                curveTo(9.776f, 4.0f, 10.0f, 3.776f, 10.0f, 3.5f)
                curveTo(10.0f, 3.224f, 9.776f, 3.0f, 9.5f, 3.0f)
                curveTo(9.224f, 3.0f, 9.0f, 3.224f, 9.0f, 3.5f)
                curveTo(9.0f, 3.776f, 9.224f, 4.0f, 9.5f, 4.0f)
                close()
                moveTo(11.0f, 2.5f)
                curveTo(11.0f, 2.224f, 11.224f, 2.0f, 11.5f, 2.0f)
                curveTo(11.776f, 2.0f, 12.0f, 2.224f, 12.0f, 2.5f)
                curveTo(12.0f, 2.776f, 11.776f, 3.0f, 11.5f, 3.0f)
                curveTo(11.224f, 3.0f, 11.0f, 2.776f, 11.0f, 2.5f)
                close()
                moveTo(11.0f, 4.5f)
                curveTo(11.0f, 4.224f, 11.224f, 4.0f, 11.5f, 4.0f)
                curveTo(11.776f, 4.0f, 12.0f, 4.224f, 12.0f, 4.5f)
                curveTo(12.0f, 4.776f, 11.776f, 5.0f, 11.5f, 5.0f)
                curveTo(11.224f, 5.0f, 11.0f, 4.776f, 11.0f, 4.5f)
                close()
                moveTo(13.0f, 1.5f)
                curveTo(13.0f, 1.224f, 13.224f, 1.0f, 13.5f, 1.0f)
                curveTo(13.776f, 1.0f, 14.0f, 1.224f, 14.0f, 1.5f)
                curveTo(14.0f, 1.776f, 13.776f, 2.0f, 13.5f, 2.0f)
                curveTo(13.224f, 2.0f, 13.0f, 1.776f, 13.0f, 1.5f)
                close()
                moveTo(13.0f, 3.5f)
                curveTo(13.0f, 3.224f, 13.224f, 3.0f, 13.5f, 3.0f)
                curveTo(13.776f, 3.0f, 14.0f, 3.224f, 14.0f, 3.5f)
                curveTo(14.0f, 3.776f, 13.776f, 4.0f, 13.5f, 4.0f)
                curveTo(13.224f, 4.0f, 13.0f, 3.776f, 13.0f, 3.5f)
                close()
                moveTo(13.0f, 5.5f)
                curveTo(13.0f, 5.224f, 13.224f, 5.0f, 13.5f, 5.0f)
                curveTo(13.776f, 5.0f, 14.0f, 5.224f, 14.0f, 5.5f)
                curveTo(14.0f, 5.776f, 13.776f, 6.0f, 13.5f, 6.0f)
                curveTo(13.224f, 6.0f, 13.0f, 5.776f, 13.0f, 5.5f)
                close()
                moveTo(9.975f, 6.372f)
                curveTo(9.981f, 6.394f, 9.985f, 6.413f, 9.988f, 6.436f)
                curveTo(9.989f, 6.445f, 9.991f, 6.454f, 9.993f, 6.462f)
                curveTo(9.997f, 6.474f, 10.0f, 6.487f, 10.0f, 6.5f)
                verticalLineTo(13.25f)
                curveTo(10.0f, 14.216f, 9.216f, 15.0f, 8.25f, 15.0f)
                horizontalLineTo(4.75f)
                curveTo(3.784f, 15.0f, 3.0f, 14.216f, 3.0f, 13.25f)
                verticalLineTo(6.5f)
                curveTo(3.0f, 6.487f, 3.003f, 6.474f, 3.007f, 6.462f)
                curveTo(3.009f, 6.454f, 3.012f, 6.445f, 3.013f, 6.436f)
                curveTo(3.016f, 6.413f, 3.02f, 6.394f, 3.026f, 6.372f)
                curveTo(3.05f, 6.286f, 3.086f, 6.207f, 3.147f, 6.146f)
                lineTo(5.001f, 4.293f)
                verticalLineTo(2.5f)
                curveTo(5.001f, 2.224f, 5.225f, 2.0f, 5.501f, 2.0f)
                horizontalLineTo(7.5f)
                curveTo(7.776f, 2.0f, 8.0f, 2.224f, 8.0f, 2.5f)
                verticalLineTo(4.292f)
                lineTo(9.854f, 6.146f)
                curveTo(9.915f, 6.207f, 9.952f, 6.287f, 9.975f, 6.372f)
                close()
                moveTo(7.001f, 3.0f)
                horizontalLineTo(6.001f)
                verticalLineTo(4.0f)
                horizontalLineTo(7.001f)
                verticalLineTo(3.0f)
                close()
                moveTo(7.294f, 5.0f)
                horizontalLineTo(5.708f)
                lineTo(4.708f, 6.0f)
                horizontalLineTo(8.294f)
                lineTo(7.294f, 5.0f)
                close()
                moveTo(8.251f, 14.0f)
                curveTo(8.665f, 14.0f, 9.001f, 13.664f, 9.001f, 13.25f)
                verticalLineTo(7.0f)
                horizontalLineTo(4.001f)
                verticalLineTo(13.25f)
                curveTo(4.001f, 13.664f, 4.337f, 14.0f, 4.751f, 14.0f)
                horizontalLineTo(8.251f)
                close()
            }
        }
        .build()
        return _sprayCan!!
    }

@Suppress("ObjectPropertyName")
private var _sprayCan: ImageVector? = null

@Preview
@Composable
private fun SprayCanPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.SprayCan, contentDescription = null)
    }
}

