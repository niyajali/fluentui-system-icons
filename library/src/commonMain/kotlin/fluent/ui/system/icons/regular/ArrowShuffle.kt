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
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Regular.ArrowShuffle: ImageVector
    get() {
        if (_ArrowShuffle != null) {
            return _ArrowShuffle!!
        }
        _ArrowShuffle = ImageVector.Builder(
            name = "Regular.ArrowShuffle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(19.28f, 4.72f)
                curveTo(18.987f, 4.427f, 18.513f, 4.427f, 18.22f, 4.72f)
                curveTo(17.927f, 5.013f, 17.927f, 5.487f, 18.22f, 5.78f)
                lineTo(19.439f, 7f)
                horizontalLineTo(19.25f)
                curveTo(15.332f, 7f, 12.827f, 9.302f, 10.558f, 11.388f)
                lineTo(10.493f, 11.448f)
                curveTo(8.154f, 13.597f, 6.044f, 15.5f, 2.75f, 15.5f)
                curveTo(2.336f, 15.5f, 2f, 15.836f, 2f, 16.25f)
                curveTo(2f, 16.664f, 2.336f, 17f, 2.75f, 17f)
                curveTo(6.668f, 17f, 9.173f, 14.698f, 11.442f, 12.612f)
                lineTo(11.442f, 12.612f)
                lineTo(11.507f, 12.552f)
                curveTo(13.846f, 10.403f, 15.956f, 8.5f, 19.25f, 8.5f)
                horizontalLineTo(19.439f)
                lineTo(18.22f, 9.72f)
                curveTo(17.927f, 10.013f, 17.927f, 10.487f, 18.22f, 10.78f)
                curveTo(18.513f, 11.073f, 18.987f, 11.073f, 19.28f, 10.78f)
                lineTo(21.78f, 8.28f)
                curveTo(21.921f, 8.14f, 22f, 7.949f, 22f, 7.75f)
                curveTo(22f, 7.551f, 21.921f, 7.36f, 21.78f, 7.22f)
                lineTo(19.28f, 4.72f)
                close()
                moveTo(2.75f, 7f)
                curveTo(5.998f, 7f, 8.275f, 8.582f, 10.251f, 10.311f)
                curveTo(10.149f, 10.405f, 10.048f, 10.498f, 9.948f, 10.59f)
                lineTo(9.816f, 10.711f)
                curveTo(9.585f, 10.924f, 9.358f, 11.131f, 9.136f, 11.332f)
                curveTo(7.283f, 9.731f, 5.4f, 8.5f, 2.75f, 8.5f)
                curveTo(2.336f, 8.5f, 2f, 8.164f, 2f, 7.75f)
                curveTo(2f, 7.336f, 2.336f, 7f, 2.75f, 7f)
                close()
                moveTo(19.25f, 17f)
                curveTo(16.002f, 17f, 13.725f, 15.418f, 11.749f, 13.689f)
                curveTo(11.851f, 13.595f, 11.951f, 13.502f, 12.051f, 13.41f)
                lineTo(12.052f, 13.41f)
                lineTo(12.184f, 13.288f)
                curveTo(12.415f, 13.076f, 12.642f, 12.869f, 12.864f, 12.668f)
                curveTo(14.717f, 14.268f, 16.6f, 15.5f, 19.25f, 15.5f)
                horizontalLineTo(19.439f)
                lineTo(18.22f, 14.28f)
                curveTo(17.927f, 13.987f, 17.927f, 13.512f, 18.22f, 13.219f)
                curveTo(18.513f, 12.927f, 18.987f, 12.927f, 19.28f, 13.219f)
                lineTo(21.78f, 15.719f)
                curveTo(21.921f, 15.86f, 22f, 16.051f, 22f, 16.25f)
                curveTo(22f, 16.449f, 21.921f, 16.639f, 21.78f, 16.78f)
                lineTo(19.28f, 19.28f)
                curveTo(18.987f, 19.573f, 18.513f, 19.573f, 18.22f, 19.28f)
                curveTo(17.927f, 18.987f, 17.927f, 18.512f, 18.22f, 18.219f)
                lineTo(19.439f, 17f)
                horizontalLineTo(19.25f)
                close()
            }
        }.build()

        return _ArrowShuffle!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowShuffle: ImageVector? = null

@Preview
@Composable
private fun ArrowShufflePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ArrowShuffle, contentDescription = null)
    }
}
