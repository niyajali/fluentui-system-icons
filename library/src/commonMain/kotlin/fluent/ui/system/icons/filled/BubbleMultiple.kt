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
 * BubbleMultiple Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used to represent bubble match games or cleaning scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_bubble_multiple_20_filled.svg)
 * 
 * @return The [ImageVector] for the BubbleMultiple icon.
 */
public val FluentIcons.Filled.BubbleMultiple: ImageVector
    get() {
        if (_bubbleMultiple != null) {
            return _bubbleMultiple!!
        }
        _bubbleMultiple = Builder(name = "BubbleMultiple", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 4.5f)
                curveTo(19.0f, 6.433f, 17.433f, 8.0f, 15.5f, 8.0f)
                curveTo(13.567f, 8.0f, 12.0f, 6.433f, 12.0f, 4.5f)
                curveTo(12.0f, 2.567f, 13.567f, 1.0f, 15.5f, 1.0f)
                curveTo(17.433f, 1.0f, 19.0f, 2.567f, 19.0f, 4.5f)
                close()
                moveTo(9.172f, 15.595f)
                curveTo(9.631f, 16.992f, 10.947f, 18.001f, 12.498f, 18.001f)
                curveTo(14.431f, 18.001f, 15.998f, 16.434f, 15.998f, 14.501f)
                curveTo(15.998f, 12.708f, 14.65f, 11.23f, 12.912f, 11.025f)
                curveTo(12.552f, 13.12f, 11.104f, 14.844f, 9.172f, 15.595f)
                close()
                moveTo(12.0f, 10.0f)
                curveTo(12.0f, 12.761f, 9.761f, 15.0f, 7.0f, 15.0f)
                curveTo(4.239f, 15.0f, 2.0f, 12.761f, 2.0f, 10.0f)
                curveTo(2.0f, 7.239f, 4.239f, 5.0f, 7.0f, 5.0f)
                curveTo(9.761f, 5.0f, 12.0f, 7.239f, 12.0f, 10.0f)
                close()
                moveTo(7.029f, 7.505f)
                curveTo(6.937f, 7.766f, 7.073f, 8.051f, 7.333f, 8.143f)
                curveTo(8.043f, 8.394f, 8.606f, 8.957f, 8.858f, 9.667f)
                curveTo(8.95f, 9.927f, 9.235f, 10.064f, 9.496f, 9.972f)
                curveTo(9.756f, 9.879f, 9.892f, 9.594f, 9.8f, 9.333f)
                curveTo(9.448f, 8.339f, 8.661f, 7.552f, 7.667f, 7.2f)
                curveTo(7.406f, 7.108f, 7.121f, 7.245f, 7.029f, 7.505f)
                close()
            }
        }
        .build()
        return _bubbleMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _bubbleMultiple: ImageVector? = null

@Preview
@Composable
private fun BubbleMultiplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.BubbleMultiple, contentDescription = "BubbleMultiple Icon")
    }
}

