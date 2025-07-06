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

package fluent.ui.system.icons.filled

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
 * SprayCan Icon (16dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 16dp
 * - Keywords: fluent-icon, visual studio code
 * - Description: Used to represent airbrush tooling.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_spray_can_16_filled.svg)
 * 
 * @return The [ImageVector] for the SprayCan icon.
 */
public val FluentIcons.Filled.SprayCan: ImageVector
    get() {
        if (_sprayCan != null) {
            return _sprayCan!!
        }
        _sprayCan = Builder(name = "SprayCan", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 1.5f)
                curveTo(14.0f, 1.224f, 14.224f, 1.0f, 14.5f, 1.0f)
                curveTo(14.776f, 1.0f, 15.0f, 1.224f, 15.0f, 1.5f)
                curveTo(15.0f, 1.776f, 14.776f, 2.0f, 14.5f, 2.0f)
                curveTo(14.224f, 2.0f, 14.0f, 1.776f, 14.0f, 1.5f)
                close()
                moveTo(12.0f, 2.5f)
                curveTo(12.0f, 2.224f, 12.224f, 2.0f, 12.5f, 2.0f)
                curveTo(12.776f, 2.0f, 13.0f, 2.224f, 13.0f, 2.5f)
                curveTo(13.0f, 2.776f, 12.776f, 3.0f, 12.5f, 3.0f)
                curveTo(12.224f, 3.0f, 12.0f, 2.776f, 12.0f, 2.5f)
                close()
                moveTo(10.5f, 4.0f)
                curveTo(10.776f, 4.0f, 11.0f, 3.776f, 11.0f, 3.5f)
                curveTo(11.0f, 3.224f, 10.776f, 3.0f, 10.5f, 3.0f)
                curveTo(10.224f, 3.0f, 10.0f, 3.224f, 10.0f, 3.5f)
                curveTo(10.0f, 3.776f, 10.224f, 4.0f, 10.5f, 4.0f)
                close()
                moveTo(12.5f, 4.0f)
                curveTo(12.224f, 4.0f, 12.0f, 4.224f, 12.0f, 4.5f)
                curveTo(12.0f, 4.776f, 12.224f, 5.0f, 12.5f, 5.0f)
                curveTo(12.776f, 5.0f, 13.0f, 4.776f, 13.0f, 4.5f)
                curveTo(13.0f, 4.224f, 12.776f, 4.0f, 12.5f, 4.0f)
                close()
                moveTo(14.5f, 3.0f)
                curveTo(14.224f, 3.0f, 14.0f, 3.224f, 14.0f, 3.5f)
                curveTo(14.0f, 3.776f, 14.224f, 4.0f, 14.5f, 4.0f)
                curveTo(14.776f, 4.0f, 15.0f, 3.776f, 15.0f, 3.5f)
                curveTo(15.0f, 3.224f, 14.776f, 3.0f, 14.5f, 3.0f)
                close()
                moveTo(14.0f, 5.5f)
                curveTo(14.0f, 5.224f, 14.224f, 5.0f, 14.5f, 5.0f)
                curveTo(14.776f, 5.0f, 15.0f, 5.224f, 15.0f, 5.5f)
                curveTo(15.0f, 5.776f, 14.776f, 6.0f, 14.5f, 6.0f)
                curveTo(14.224f, 6.0f, 14.0f, 5.776f, 14.0f, 5.5f)
                close()
                moveTo(10.988f, 6.436f)
                curveTo(10.985f, 6.413f, 10.981f, 6.394f, 10.975f, 6.372f)
                curveTo(10.952f, 6.287f, 10.915f, 6.207f, 10.854f, 6.146f)
                lineTo(9.0f, 4.292f)
                verticalLineTo(2.5f)
                curveTo(9.0f, 2.224f, 8.776f, 2.0f, 8.5f, 2.0f)
                horizontalLineTo(6.501f)
                curveTo(6.225f, 2.0f, 6.001f, 2.224f, 6.001f, 2.5f)
                verticalLineTo(4.293f)
                lineTo(4.147f, 6.146f)
                curveTo(4.086f, 6.207f, 4.05f, 6.286f, 4.026f, 6.372f)
                curveTo(4.02f, 6.394f, 4.016f, 6.413f, 4.013f, 6.436f)
                curveTo(4.012f, 6.442f, 4.011f, 6.447f, 4.009f, 6.453f)
                curveTo(4.009f, 6.456f, 4.008f, 6.459f, 4.007f, 6.462f)
                curveTo(4.003f, 6.474f, 4.0f, 6.487f, 4.0f, 6.5f)
                verticalLineTo(13.25f)
                curveTo(4.0f, 14.216f, 4.784f, 15.0f, 5.75f, 15.0f)
                horizontalLineTo(9.25f)
                curveTo(10.216f, 15.0f, 11.0f, 14.216f, 11.0f, 13.25f)
                verticalLineTo(6.5f)
                curveTo(11.0f, 6.489f, 10.997f, 6.478f, 10.995f, 6.469f)
                curveTo(10.994f, 6.466f, 10.993f, 6.464f, 10.993f, 6.462f)
                curveTo(10.991f, 6.454f, 10.989f, 6.445f, 10.988f, 6.436f)
                close()
                moveTo(7.001f, 3.0f)
                horizontalLineTo(8.001f)
                verticalLineTo(4.0f)
                horizontalLineTo(7.001f)
                verticalLineTo(3.0f)
                close()
                moveTo(6.708f, 5.0f)
                horizontalLineTo(8.294f)
                lineTo(9.294f, 6.0f)
                horizontalLineTo(5.708f)
                lineTo(6.708f, 5.0f)
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
        Image(imageVector = FluentIcons.Filled.SprayCan, contentDescription = "SprayCan Icon")
    }
}

