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
 * BubbleMultiple Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used to represent bubble match games or cleaning scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_bubble_multiple_20_regular.svg)
 * 
 * @return The [ImageVector] for the BubbleMultiple icon.
 */
public val FluentIcons.Regular.BubbleMultiple: ImageVector
    get() {
        if (_bubbleMultiple != null) {
            return _bubbleMultiple!!
        }
        _bubbleMultiple = Builder(name = "BubbleMultiple", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.5f, 2.0f)
                curveTo(14.119f, 2.0f, 13.0f, 3.119f, 13.0f, 4.5f)
                curveTo(13.0f, 5.881f, 14.119f, 7.0f, 15.5f, 7.0f)
                curveTo(16.881f, 7.0f, 18.0f, 5.881f, 18.0f, 4.5f)
                curveTo(18.0f, 3.119f, 16.881f, 2.0f, 15.5f, 2.0f)
                close()
                moveTo(12.0f, 4.5f)
                curveTo(12.0f, 2.567f, 13.567f, 1.0f, 15.5f, 1.0f)
                curveTo(17.433f, 1.0f, 19.0f, 2.567f, 19.0f, 4.5f)
                curveTo(19.0f, 6.433f, 17.433f, 8.0f, 15.5f, 8.0f)
                curveTo(13.567f, 8.0f, 12.0f, 6.433f, 12.0f, 4.5f)
                close()
                moveTo(3.0f, 10.0f)
                curveTo(3.0f, 7.791f, 4.791f, 6.0f, 7.0f, 6.0f)
                curveTo(9.209f, 6.0f, 11.0f, 7.791f, 11.0f, 10.0f)
                curveTo(11.0f, 12.209f, 9.209f, 14.0f, 7.0f, 14.0f)
                curveTo(4.791f, 14.0f, 3.0f, 12.209f, 3.0f, 10.0f)
                close()
                moveTo(7.0f, 5.0f)
                curveTo(4.239f, 5.0f, 2.0f, 7.239f, 2.0f, 10.0f)
                curveTo(2.0f, 12.761f, 4.239f, 15.0f, 7.0f, 15.0f)
                curveTo(9.761f, 15.0f, 12.0f, 12.761f, 12.0f, 10.0f)
                curveTo(12.0f, 7.239f, 9.761f, 5.0f, 7.0f, 5.0f)
                close()
                moveTo(12.499f, 17.999f)
                curveTo(10.948f, 17.999f, 9.633f, 16.991f, 9.174f, 15.594f)
                curveTo(9.491f, 15.471f, 9.795f, 15.321f, 10.084f, 15.148f)
                curveTo(10.37f, 16.214f, 11.343f, 16.999f, 12.499f, 16.999f)
                curveTo(13.88f, 16.999f, 14.999f, 15.88f, 14.999f, 14.499f)
                curveTo(14.999f, 13.171f, 13.964f, 12.085f, 12.657f, 12.004f)
                curveTo(12.769f, 11.688f, 12.855f, 11.361f, 12.913f, 11.023f)
                curveTo(14.651f, 11.228f, 15.999f, 12.706f, 15.999f, 14.499f)
                curveTo(15.999f, 16.432f, 14.432f, 17.999f, 12.499f, 17.999f)
                close()
                moveTo(7.667f, 7.2f)
                curveTo(7.406f, 7.108f, 7.121f, 7.245f, 7.029f, 7.505f)
                curveTo(6.937f, 7.766f, 7.073f, 8.051f, 7.333f, 8.143f)
                curveTo(8.043f, 8.394f, 8.606f, 8.957f, 8.858f, 9.667f)
                curveTo(8.95f, 9.927f, 9.235f, 10.064f, 9.496f, 9.972f)
                curveTo(9.756f, 9.879f, 9.892f, 9.594f, 9.8f, 9.333f)
                curveTo(9.448f, 8.339f, 8.661f, 7.552f, 7.667f, 7.2f)
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
        Image(imageVector = FluentIcons.Regular.BubbleMultiple, contentDescription = "BubbleMultiple Icon")
    }
}

