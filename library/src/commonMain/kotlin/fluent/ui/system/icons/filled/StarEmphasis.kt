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
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Filled.StarEmphasis: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.StarEmphasis",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(13.211f, 3.102f)
            curveTo(12.716f, 2.099f, 11.285f, 2.099f, 10.79f, 3.102f)
            lineTo(8.432f, 7.88f)
            lineTo(3.159f, 8.646f)
            curveTo(2.052f, 8.807f, 1.61f, 10.168f, 2.411f, 10.949f)
            lineTo(6.226f, 14.668f)
            lineTo(5.326f, 19.919f)
            curveTo(5.137f, 21.022f, 6.294f, 21.863f, 7.284f, 21.342f)
            lineTo(12f, 18.863f)
            lineTo(16.716f, 21.342f)
            curveTo(17.707f, 21.863f, 18.864f, 21.022f, 18.675f, 19.919f)
            lineTo(17.774f, 14.668f)
            lineTo(21.59f, 10.949f)
            curveTo(22.391f, 10.168f, 21.949f, 8.807f, 20.841f, 8.646f)
            lineTo(15.569f, 7.88f)
            lineTo(13.211f, 3.102f)
            close()
            moveTo(1.164f, 3.781f)
            curveTo(0.906f, 4.104f, 0.958f, 4.576f, 1.282f, 4.835f)
            lineTo(3.782f, 6.835f)
            curveTo(4.105f, 7.094f, 4.577f, 7.042f, 4.836f, 6.718f)
            curveTo(5.094f, 6.395f, 5.042f, 5.923f, 4.719f, 5.664f)
            lineTo(2.219f, 3.664f)
            curveTo(1.895f, 3.405f, 1.423f, 3.458f, 1.164f, 3.781f)
            close()
            moveTo(22.836f, 18.218f)
            curveTo(23.094f, 17.895f, 23.042f, 17.423f, 22.719f, 17.164f)
            lineTo(20.219f, 15.164f)
            curveTo(19.895f, 14.905f, 19.423f, 14.958f, 19.164f, 15.281f)
            curveTo(18.906f, 15.604f, 18.958f, 16.076f, 19.281f, 16.335f)
            lineTo(21.781f, 18.335f)
            curveTo(22.105f, 18.594f, 22.577f, 18.542f, 22.836f, 18.218f)
            close()
            moveTo(1.282f, 17.164f)
            curveTo(0.958f, 17.423f, 0.906f, 17.895f, 1.164f, 18.218f)
            curveTo(1.423f, 18.542f, 1.895f, 18.594f, 2.219f, 18.335f)
            lineTo(4.719f, 16.335f)
            curveTo(5.042f, 16.076f, 5.094f, 15.604f, 4.836f, 15.281f)
            curveTo(4.577f, 14.958f, 4.105f, 14.905f, 3.782f, 15.164f)
            lineTo(1.282f, 17.164f)
            close()
            moveTo(22.836f, 3.781f)
            curveTo(23.094f, 4.104f, 23.042f, 4.576f, 22.719f, 4.835f)
            lineTo(20.219f, 6.835f)
            curveTo(19.895f, 7.094f, 19.423f, 7.042f, 19.164f, 6.718f)
            curveTo(18.906f, 6.395f, 18.958f, 5.923f, 19.281f, 5.664f)
            lineTo(21.781f, 3.664f)
            curveTo(22.105f, 3.405f, 22.577f, 3.458f, 22.836f, 3.781f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun StarEmphasisPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.StarEmphasis, contentDescription = null)
    }
}
