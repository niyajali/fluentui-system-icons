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
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Regular.PaddingTop: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PaddingTop",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(4.5f, 2.75f)
            curveTo(4.5f, 2.336f, 4.836f, 2f, 5.25f, 2f)
            horizontalLineTo(6.117f)
            curveTo(6.531f, 2f, 6.867f, 2.336f, 6.867f, 2.75f)
            curveTo(6.867f, 3.164f, 6.531f, 3.5f, 6.117f, 3.5f)
            horizontalLineTo(5.25f)
            curveTo(4.836f, 3.5f, 4.5f, 3.164f, 4.5f, 2.75f)
            close()
            moveTo(7.967f, 2.75f)
            curveTo(7.967f, 2.336f, 8.302f, 2f, 8.717f, 2f)
            horizontalLineTo(10.45f)
            curveTo(10.864f, 2f, 11.2f, 2.336f, 11.2f, 2.75f)
            curveTo(11.2f, 3.164f, 10.864f, 3.5f, 10.45f, 3.5f)
            horizontalLineTo(8.717f)
            curveTo(8.302f, 3.5f, 7.967f, 3.164f, 7.967f, 2.75f)
            close()
            moveTo(12.3f, 2.75f)
            curveTo(12.3f, 2.336f, 12.636f, 2f, 13.05f, 2f)
            horizontalLineTo(14.783f)
            curveTo(15.198f, 2f, 15.533f, 2.336f, 15.533f, 2.75f)
            curveTo(15.533f, 3.164f, 15.198f, 3.5f, 14.783f, 3.5f)
            horizontalLineTo(13.05f)
            curveTo(12.636f, 3.5f, 12.3f, 3.164f, 12.3f, 2.75f)
            close()
            moveTo(16.633f, 2.75f)
            curveTo(16.633f, 2.336f, 16.969f, 2f, 17.383f, 2f)
            horizontalLineTo(18.25f)
            curveTo(18.664f, 2f, 19f, 2.336f, 19f, 2.75f)
            curveTo(19f, 3.164f, 18.664f, 3.5f, 18.25f, 3.5f)
            horizontalLineTo(17.383f)
            curveTo(16.969f, 3.5f, 16.633f, 3.164f, 16.633f, 2.75f)
            close()
            moveTo(4.5f, 21.25f)
            curveTo(4.5f, 20.836f, 4.836f, 20.5f, 5.25f, 20.5f)
            horizontalLineTo(18.25f)
            curveTo(18.664f, 20.5f, 19f, 20.836f, 19f, 21.25f)
            curveTo(19f, 21.664f, 18.664f, 22f, 18.25f, 22f)
            horizontalLineTo(5.25f)
            curveTo(4.836f, 22f, 4.5f, 21.664f, 4.5f, 21.25f)
            close()
            moveTo(12.28f, 5.22f)
            curveTo(11.987f, 4.927f, 11.513f, 4.927f, 11.22f, 5.22f)
            lineTo(6.22f, 10.22f)
            curveTo(5.927f, 10.513f, 5.927f, 10.987f, 6.22f, 11.28f)
            curveTo(6.513f, 11.573f, 6.987f, 11.573f, 7.28f, 11.28f)
            lineTo(11f, 7.561f)
            verticalLineTo(18.25f)
            curveTo(11f, 18.664f, 11.336f, 19f, 11.75f, 19f)
            curveTo(12.164f, 19f, 12.5f, 18.664f, 12.5f, 18.25f)
            verticalLineTo(7.561f)
            lineTo(16.22f, 11.28f)
            curveTo(16.513f, 11.573f, 16.987f, 11.573f, 17.28f, 11.28f)
            curveTo(17.573f, 10.987f, 17.573f, 10.513f, 17.28f, 10.22f)
            lineTo(12.28f, 5.22f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PaddingTopPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.PaddingTop, contentDescription = null)
    }
}
