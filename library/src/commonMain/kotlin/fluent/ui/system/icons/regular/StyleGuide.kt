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

public val FluentIcons.Regular.StyleGuide: ImageVector
    get() {
        if (_StyleGuide != null) {
            return _StyleGuide!!
        }
        _StyleGuide = ImageVector.Builder(
            name = "Regular.StyleGuide",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(14.034f, 2.778f)
                curveTo(15.501f, 2.385f, 17.009f, 3.255f, 17.402f, 4.723f)
                lineTo(20.12f, 14.865f)
                curveTo(20.513f, 16.332f, 19.642f, 17.84f, 18.175f, 18.233f)
                lineTo(11.897f, 19.915f)
                curveTo(10.43f, 20.308f, 8.922f, 19.438f, 8.529f, 17.971f)
                lineTo(5.811f, 7.828f)
                curveTo(5.418f, 6.361f, 6.289f, 4.853f, 7.756f, 4.46f)
                lineTo(14.034f, 2.778f)
                close()
                moveTo(5.801f, 11.658f)
                lineTo(7.563f, 18.229f)
                curveTo(7.744f, 18.905f, 8.098f, 19.487f, 8.565f, 19.942f)
                lineTo(8.122f, 19.919f)
                curveTo(6.605f, 19.839f, 5.44f, 18.545f, 5.52f, 17.028f)
                lineTo(5.801f, 11.658f)
                close()
                moveTo(14.422f, 4.227f)
                lineTo(8.144f, 5.909f)
                curveTo(7.477f, 6.088f, 7.081f, 6.773f, 7.26f, 7.44f)
                lineTo(9.978f, 17.582f)
                curveTo(10.156f, 18.249f, 10.842f, 18.645f, 11.508f, 18.466f)
                lineTo(17.787f, 16.784f)
                curveTo(18.454f, 16.605f, 18.85f, 15.92f, 18.671f, 15.253f)
                lineTo(15.953f, 5.111f)
                curveTo(15.775f, 4.444f, 15.089f, 4.048f, 14.422f, 4.227f)
                close()
                moveTo(4.876f, 10.18f)
                lineTo(4.521f, 16.976f)
                curveTo(4.484f, 17.675f, 4.641f, 18.339f, 4.945f, 18.916f)
                lineTo(4.531f, 18.756f)
                curveTo(3.113f, 18.211f, 2.405f, 16.621f, 2.949f, 15.203f)
                lineTo(4.876f, 10.18f)
                close()
                moveTo(9.739f, 7.035f)
                curveTo(10.273f, 6.892f, 10.821f, 7.208f, 10.964f, 7.742f)
                curveTo(11.107f, 8.275f, 10.79f, 8.823f, 10.257f, 8.966f)
                curveTo(9.724f, 9.109f, 9.175f, 8.793f, 9.032f, 8.259f)
                curveTo(8.889f, 7.726f, 9.206f, 7.177f, 9.739f, 7.035f)
                close()
            }
        }.build()

        return _StyleGuide!!
    }

@Suppress("ObjectPropertyName")
private var _StyleGuide: ImageVector? = null

@Preview
@Composable
private fun StyleGuidePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.StyleGuide, contentDescription = null)
    }
}
