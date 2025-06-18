/**
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
package fluent.ui.system.icons.light

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
import fluent.ui.system.icons.FluentUi

public val FluentUi.Light.Note: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.Note",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(7.5f, 3f)
            curveTo(5.015f, 3f, 3f, 5.015f, 3f, 7.5f)
            verticalLineTo(24.5f)
            curveTo(3f, 26.985f, 5.015f, 29f, 7.5f, 29f)
            horizontalLineTo(16.343f)
            curveTo(17.537f, 29f, 18.681f, 28.526f, 19.525f, 27.682f)
            lineTo(27.682f, 19.525f)
            curveTo(28.526f, 18.681f, 29f, 17.537f, 29f, 16.343f)
            verticalLineTo(7.5f)
            curveTo(29f, 5.015f, 26.985f, 3f, 24.5f, 3f)
            horizontalLineTo(7.5f)
            close()
            moveTo(4f, 7.5f)
            curveTo(4f, 5.567f, 5.567f, 4f, 7.5f, 4f)
            horizontalLineTo(24.5f)
            curveTo(26.433f, 4f, 28f, 5.567f, 28f, 7.5f)
            verticalLineTo(16.343f)
            curveTo(28f, 16.565f, 27.979f, 16.785f, 27.938f, 17f)
            horizontalLineTo(21.5f)
            curveTo(19.015f, 17f, 17f, 19.015f, 17f, 21.5f)
            verticalLineTo(27.938f)
            curveTo(16.785f, 27.979f, 16.565f, 28f, 16.343f, 28f)
            horizontalLineTo(7.5f)
            curveTo(5.567f, 28f, 4f, 26.433f, 4f, 24.5f)
            verticalLineTo(7.5f)
            close()
            moveTo(18f, 27.583f)
            verticalLineTo(21.5f)
            curveTo(18f, 19.567f, 19.567f, 18f, 21.5f, 18f)
            horizontalLineTo(27.583f)
            curveTo(27.423f, 18.298f, 27.219f, 18.574f, 26.975f, 18.818f)
            lineTo(18.818f, 26.975f)
            curveTo(18.574f, 27.219f, 18.298f, 27.423f, 18f, 27.583f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun NotePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Light.Note, contentDescription = null)
    }
}
