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

public val FluentUi.Regular.PaddingDown: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PaddingDown",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(4.5f, 2.75f)
            curveTo(4.5f, 3.164f, 4.836f, 3.5f, 5.25f, 3.5f)
            horizontalLineTo(18.25f)
            curveTo(18.664f, 3.5f, 19f, 3.164f, 19f, 2.75f)
            curveTo(19f, 2.336f, 18.664f, 2f, 18.25f, 2f)
            horizontalLineTo(5.25f)
            curveTo(4.836f, 2f, 4.5f, 2.336f, 4.5f, 2.75f)
            close()
            moveTo(4.5f, 21.25f)
            curveTo(4.5f, 21.664f, 4.836f, 22f, 5.25f, 22f)
            horizontalLineTo(6.117f)
            curveTo(6.531f, 22f, 6.867f, 21.664f, 6.867f, 21.25f)
            curveTo(6.867f, 20.836f, 6.531f, 20.5f, 6.117f, 20.5f)
            horizontalLineTo(5.25f)
            curveTo(4.836f, 20.5f, 4.5f, 20.836f, 4.5f, 21.25f)
            close()
            moveTo(7.967f, 21.25f)
            curveTo(7.967f, 21.664f, 8.302f, 22f, 8.717f, 22f)
            horizontalLineTo(10.45f)
            curveTo(10.864f, 22f, 11.2f, 21.664f, 11.2f, 21.25f)
            curveTo(11.2f, 20.836f, 10.864f, 20.5f, 10.45f, 20.5f)
            horizontalLineTo(8.717f)
            curveTo(8.302f, 20.5f, 7.967f, 20.836f, 7.967f, 21.25f)
            close()
            moveTo(12.3f, 21.25f)
            curveTo(12.3f, 21.664f, 12.636f, 22f, 13.05f, 22f)
            horizontalLineTo(14.783f)
            curveTo(15.198f, 22f, 15.533f, 21.664f, 15.533f, 21.25f)
            curveTo(15.533f, 20.836f, 15.198f, 20.5f, 14.783f, 20.5f)
            horizontalLineTo(13.05f)
            curveTo(12.636f, 20.5f, 12.3f, 20.836f, 12.3f, 21.25f)
            close()
            moveTo(16.633f, 21.25f)
            curveTo(16.633f, 21.664f, 16.969f, 22f, 17.383f, 22f)
            horizontalLineTo(18.25f)
            curveTo(18.664f, 22f, 19f, 21.664f, 19f, 21.25f)
            curveTo(19f, 20.836f, 18.664f, 20.5f, 18.25f, 20.5f)
            horizontalLineTo(17.383f)
            curveTo(16.969f, 20.5f, 16.633f, 20.836f, 16.633f, 21.25f)
            close()
            moveTo(12.28f, 18.78f)
            curveTo(11.987f, 19.073f, 11.513f, 19.073f, 11.22f, 18.78f)
            lineTo(6.22f, 13.78f)
            curveTo(5.927f, 13.487f, 5.927f, 13.013f, 6.22f, 12.72f)
            curveTo(6.513f, 12.427f, 6.987f, 12.427f, 7.28f, 12.72f)
            lineTo(11f, 16.439f)
            verticalLineTo(5.75f)
            curveTo(11f, 5.336f, 11.336f, 5f, 11.75f, 5f)
            curveTo(12.164f, 5f, 12.5f, 5.336f, 12.5f, 5.75f)
            verticalLineTo(16.439f)
            lineTo(16.22f, 12.72f)
            curveTo(16.513f, 12.427f, 16.987f, 12.427f, 17.28f, 12.72f)
            curveTo(17.573f, 13.013f, 17.573f, 13.487f, 17.28f, 13.78f)
            lineTo(12.28f, 18.78f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PaddingDownPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.PaddingDown, contentDescription = null)
    }
}
