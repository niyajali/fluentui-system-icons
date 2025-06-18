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

public val FluentUi.Filled.Notepad: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Notepad",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(16.25f, 2f)
            curveTo(16.664f, 2f, 17f, 2.336f, 17f, 2.75f)
            verticalLineTo(4f)
            horizontalLineTo(17.75f)
            curveTo(18.993f, 4f, 20f, 5.007f, 20f, 6.25f)
            verticalLineTo(16f)
            horizontalLineTo(16.25f)
            curveTo(15.007f, 16f, 14f, 17.007f, 14f, 18.25f)
            verticalLineTo(22f)
            horizontalLineTo(6.25f)
            curveTo(5.007f, 22f, 4f, 20.993f, 4f, 19.75f)
            verticalLineTo(6.25f)
            curveTo(4f, 5.007f, 5.007f, 4f, 6.25f, 4f)
            horizontalLineTo(7f)
            verticalLineTo(2.75f)
            curveTo(7f, 2.336f, 7.336f, 2f, 7.75f, 2f)
            curveTo(8.164f, 2f, 8.5f, 2.336f, 8.5f, 2.75f)
            verticalLineTo(4f)
            horizontalLineTo(11.25f)
            verticalLineTo(2.75f)
            curveTo(11.25f, 2.336f, 11.586f, 2f, 12f, 2f)
            curveTo(12.414f, 2f, 12.75f, 2.336f, 12.75f, 2.75f)
            verticalLineTo(4f)
            horizontalLineTo(15.5f)
            verticalLineTo(2.75f)
            curveTo(15.5f, 2.336f, 15.836f, 2f, 16.25f, 2f)
            close()
            moveTo(19.761f, 17.5f)
            curveTo(19.703f, 17.589f, 19.637f, 17.674f, 19.56f, 17.75f)
            lineTo(15.75f, 21.56f)
            curveTo(15.674f, 21.637f, 15.589f, 21.703f, 15.5f, 21.761f)
            verticalLineTo(18.25f)
            curveTo(15.5f, 17.836f, 15.836f, 17.5f, 16.25f, 17.5f)
            horizontalLineTo(19.761f)
            close()
            moveTo(8.25f, 16f)
            curveTo(7.836f, 16f, 7.5f, 16.336f, 7.5f, 16.75f)
            curveTo(7.5f, 17.164f, 7.836f, 17.5f, 8.25f, 17.5f)
            horizontalLineTo(11.25f)
            lineTo(11.327f, 17.496f)
            curveTo(11.705f, 17.458f, 12f, 17.138f, 12f, 16.75f)
            curveTo(12f, 16.362f, 11.705f, 16.042f, 11.327f, 16.004f)
            lineTo(11.25f, 16f)
            horizontalLineTo(8.25f)
            close()
            moveTo(8.25f, 12f)
            curveTo(7.836f, 12f, 7.5f, 12.336f, 7.5f, 12.75f)
            curveTo(7.5f, 13.164f, 7.836f, 13.5f, 8.25f, 13.5f)
            horizontalLineTo(15.75f)
            curveTo(16.164f, 13.5f, 16.5f, 13.164f, 16.5f, 12.75f)
            curveTo(16.5f, 12.336f, 16.164f, 12f, 15.75f, 12f)
            horizontalLineTo(8.25f)
            close()
            moveTo(8.25f, 8f)
            curveTo(7.836f, 8f, 7.5f, 8.336f, 7.5f, 8.75f)
            curveTo(7.5f, 9.164f, 7.836f, 9.5f, 8.25f, 9.5f)
            horizontalLineTo(15.75f)
            curveTo(16.164f, 9.5f, 16.5f, 9.164f, 16.5f, 8.75f)
            curveTo(16.5f, 8.336f, 16.164f, 8f, 15.75f, 8f)
            horizontalLineTo(8.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun NotepadPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Notepad, contentDescription = null)
    }
}
