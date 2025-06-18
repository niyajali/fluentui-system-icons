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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Regular.PaddingRight: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PaddingRight",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2.75f, 4.5f)
            curveTo(3.164f, 4.5f, 3.5f, 4.836f, 3.5f, 5.25f)
            lineTo(3.5f, 18.25f)
            curveTo(3.5f, 18.664f, 3.164f, 19f, 2.75f, 19f)
            curveTo(2.336f, 19f, 2f, 18.664f, 2f, 18.25f)
            verticalLineTo(5.25f)
            curveTo(2f, 4.836f, 2.336f, 4.5f, 2.75f, 4.5f)
            close()
            moveTo(21.25f, 4.5f)
            curveTo(21.664f, 4.5f, 22f, 4.836f, 22f, 5.25f)
            verticalLineTo(6.117f)
            curveTo(22f, 6.531f, 21.664f, 6.867f, 21.25f, 6.867f)
            curveTo(20.836f, 6.867f, 20.5f, 6.531f, 20.5f, 6.117f)
            verticalLineTo(5.25f)
            curveTo(20.5f, 4.836f, 20.836f, 4.5f, 21.25f, 4.5f)
            close()
            moveTo(21.25f, 7.967f)
            curveTo(21.664f, 7.967f, 22f, 8.302f, 22f, 8.717f)
            verticalLineTo(10.45f)
            curveTo(22f, 10.864f, 21.664f, 11.2f, 21.25f, 11.2f)
            curveTo(20.836f, 11.2f, 20.5f, 10.864f, 20.5f, 10.45f)
            verticalLineTo(8.717f)
            curveTo(20.5f, 8.302f, 20.836f, 7.967f, 21.25f, 7.967f)
            close()
            moveTo(21.25f, 12.3f)
            curveTo(21.664f, 12.3f, 22f, 12.636f, 22f, 13.05f)
            verticalLineTo(14.783f)
            curveTo(22f, 15.198f, 21.664f, 15.533f, 21.25f, 15.533f)
            curveTo(20.836f, 15.533f, 20.5f, 15.198f, 20.5f, 14.783f)
            verticalLineTo(13.05f)
            curveTo(20.5f, 12.636f, 20.836f, 12.3f, 21.25f, 12.3f)
            close()
            moveTo(21.25f, 16.633f)
            curveTo(21.664f, 16.633f, 22f, 16.969f, 22f, 17.383f)
            verticalLineTo(18.25f)
            curveTo(22f, 18.664f, 21.664f, 19f, 21.25f, 19f)
            curveTo(20.836f, 19f, 20.5f, 18.664f, 20.5f, 18.25f)
            verticalLineTo(17.383f)
            curveTo(20.5f, 16.969f, 20.836f, 16.633f, 21.25f, 16.633f)
            close()
            moveTo(18.78f, 12.28f)
            curveTo(19.073f, 11.987f, 19.073f, 11.513f, 18.78f, 11.22f)
            lineTo(13.78f, 6.22f)
            curveTo(13.487f, 5.927f, 13.013f, 5.927f, 12.72f, 6.22f)
            curveTo(12.427f, 6.513f, 12.427f, 6.987f, 12.72f, 7.28f)
            lineTo(16.439f, 11f)
            lineTo(5.75f, 11f)
            curveTo(5.336f, 11f, 5f, 11.336f, 5f, 11.75f)
            curveTo(5f, 12.164f, 5.336f, 12.5f, 5.75f, 12.5f)
            lineTo(16.439f, 12.5f)
            lineTo(12.72f, 16.22f)
            curveTo(12.427f, 16.513f, 12.427f, 16.987f, 12.72f, 17.28f)
            curveTo(13.013f, 17.573f, 13.487f, 17.573f, 13.78f, 17.28f)
            lineTo(18.78f, 12.28f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PaddingRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.PaddingRight, contentDescription = null)
    }
}
