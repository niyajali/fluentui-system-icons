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
 * ArrowBetweenUp icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: arrow, between, up
 * - Source: ic_fluent_arrow_between_up_20_filled.svg
 * 
 * @return The [ImageVector] for the ArrowBetweenUp icon.
 */
public val FluentIcons.Filled.ArrowBetweenUp: ImageVector
    get() {
        if (_arrowBetweenUp != null) {
            return _arrowBetweenUp!!
        }
        _arrowBetweenUp = Builder(name = "ArrowBetweenUp", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 18.25f)
                curveTo(5.0f, 18.664f, 4.664f, 19.0f, 4.25f, 19.0f)
                curveTo(3.836f, 19.0f, 3.5f, 18.664f, 3.5f, 18.25f)
                lineTo(3.5f, 17.75f)
                curveTo(3.5f, 16.784f, 4.284f, 16.0f, 5.25f, 16.0f)
                lineTo(14.25f, 16.0f)
                curveTo(15.217f, 16.0f, 16.0f, 16.784f, 16.0f, 17.75f)
                lineTo(16.0f, 18.25f)
                curveTo(16.0f, 18.664f, 15.664f, 19.0f, 15.25f, 19.0f)
                curveTo(14.836f, 19.0f, 14.5f, 18.664f, 14.5f, 18.25f)
                lineTo(14.5f, 17.75f)
                curveTo(14.5f, 17.612f, 14.388f, 17.5f, 14.25f, 17.5f)
                lineTo(5.25f, 17.5f)
                curveTo(5.112f, 17.5f, 5.0f, 17.612f, 5.0f, 17.75f)
                lineTo(5.0f, 18.25f)
                close()
                moveTo(9.75f, 15.0f)
                curveTo(10.164f, 15.0f, 10.5f, 14.664f, 10.5f, 14.25f)
                lineTo(10.5f, 7.561f)
                lineTo(13.47f, 10.53f)
                curveTo(13.763f, 10.823f, 14.237f, 10.823f, 14.53f, 10.53f)
                curveTo(14.823f, 10.237f, 14.823f, 9.763f, 14.53f, 9.47f)
                lineTo(10.28f, 5.22f)
                curveTo(9.987f, 4.927f, 9.513f, 4.927f, 9.22f, 5.22f)
                lineTo(4.97f, 9.47f)
                curveTo(4.677f, 9.763f, 4.677f, 10.237f, 4.97f, 10.53f)
                curveTo(5.263f, 10.823f, 5.737f, 10.823f, 6.03f, 10.53f)
                lineTo(9.0f, 7.561f)
                lineTo(9.0f, 14.25f)
                curveTo(9.0f, 14.664f, 9.336f, 15.0f, 9.75f, 15.0f)
                close()
                moveTo(3.5f, 2.25f)
                curveTo(3.5f, 3.217f, 4.284f, 4.0f, 5.25f, 4.0f)
                lineTo(14.25f, 4.0f)
                curveTo(15.217f, 4.0f, 16.0f, 3.217f, 16.0f, 2.25f)
                lineTo(16.0f, 1.75f)
                curveTo(16.0f, 1.336f, 15.664f, 1.0f, 15.25f, 1.0f)
                curveTo(14.836f, 1.0f, 14.5f, 1.336f, 14.5f, 1.75f)
                lineTo(14.5f, 2.25f)
                curveTo(14.5f, 2.388f, 14.388f, 2.5f, 14.25f, 2.5f)
                lineTo(5.25f, 2.5f)
                curveTo(5.112f, 2.5f, 5.0f, 2.388f, 5.0f, 2.25f)
                lineTo(5.0f, 1.75f)
                curveTo(5.0f, 1.336f, 4.664f, 1.0f, 4.25f, 1.0f)
                curveTo(3.836f, 1.0f, 3.5f, 1.336f, 3.5f, 1.75f)
                lineTo(3.5f, 2.25f)
                close()
            }
        }
        .build()
        return _arrowBetweenUp!!
    }

@Suppress("ObjectPropertyName")
private var _arrowBetweenUp: ImageVector? = null

@Preview
@Composable
private fun ArrowBetweenUpPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ArrowBetweenUp, contentDescription = null)
    }
}

