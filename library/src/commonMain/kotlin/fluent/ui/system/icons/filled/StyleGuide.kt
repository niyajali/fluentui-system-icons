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
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Filled.StyleGuide: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.StyleGuide",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(17.402f, 4.723f)
            lineTo(20.12f, 14.865f)
            curveTo(20.513f, 16.332f, 19.642f, 17.84f, 18.175f, 18.233f)
            lineTo(11.897f, 19.915f)
            curveTo(10.43f, 20.308f, 8.922f, 19.438f, 8.529f, 17.971f)
            lineTo(5.811f, 7.828f)
            curveTo(5.418f, 6.361f, 6.289f, 4.853f, 7.756f, 4.46f)
            lineTo(14.034f, 2.778f)
            curveTo(15.501f, 2.385f, 17.009f, 3.255f, 17.402f, 4.723f)
            close()
            moveTo(10.964f, 7.742f)
            curveTo(10.821f, 7.208f, 10.273f, 6.892f, 9.739f, 7.035f)
            curveTo(9.206f, 7.177f, 8.889f, 7.726f, 9.032f, 8.259f)
            curveTo(9.175f, 8.793f, 9.724f, 9.109f, 10.257f, 8.966f)
            curveTo(10.79f, 8.823f, 11.107f, 8.275f, 10.964f, 7.742f)
            close()
            moveTo(5.801f, 11.658f)
            lineTo(7.563f, 18.229f)
            curveTo(7.744f, 18.905f, 8.098f, 19.487f, 8.565f, 19.942f)
            lineTo(8.122f, 19.919f)
            curveTo(6.605f, 19.839f, 5.44f, 18.545f, 5.52f, 17.028f)
            lineTo(5.801f, 11.658f)
            close()
            moveTo(4.876f, 10.18f)
            lineTo(4.521f, 16.976f)
            curveTo(4.484f, 17.675f, 4.641f, 18.339f, 4.945f, 18.916f)
            lineTo(4.531f, 18.756f)
            curveTo(3.113f, 18.211f, 2.405f, 16.621f, 2.949f, 15.203f)
            lineTo(4.876f, 10.18f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun StyleGuidePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.StyleGuide, contentDescription = null)
    }
}
