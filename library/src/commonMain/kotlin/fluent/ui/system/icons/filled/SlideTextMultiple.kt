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

public val FluentIcons.Filled.SlideTextMultiple: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SlideTextMultiple",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(17f, 4f)
            curveTo(18.657f, 4f, 20f, 5.343f, 20f, 7f)
            verticalLineTo(16f)
            curveTo(20f, 17.657f, 18.657f, 19f, 17f, 19f)
            horizontalLineTo(5f)
            curveTo(3.343f, 19f, 2f, 17.657f, 2f, 16f)
            verticalLineTo(7f)
            curveTo(2f, 5.343f, 3.343f, 4f, 5f, 4f)
            horizontalLineTo(17f)
            close()
            moveTo(6.75f, 7.5f)
            curveTo(6.336f, 7.5f, 6f, 7.836f, 6f, 8.25f)
            curveTo(6f, 8.664f, 6.336f, 9f, 6.75f, 9f)
            horizontalLineTo(10.25f)
            curveTo(10.664f, 9f, 11f, 8.664f, 11f, 8.25f)
            curveTo(11f, 7.836f, 10.664f, 7.5f, 10.25f, 7.5f)
            horizontalLineTo(6.75f)
            close()
            moveTo(6.75f, 10.5f)
            curveTo(6.336f, 10.5f, 6f, 10.836f, 6f, 11.25f)
            curveTo(6f, 11.664f, 6.336f, 12f, 6.75f, 12f)
            horizontalLineTo(13.25f)
            curveTo(13.664f, 12f, 14f, 11.664f, 14f, 11.25f)
            curveTo(14f, 10.836f, 13.664f, 10.5f, 13.25f, 10.5f)
            horizontalLineTo(6.75f)
            close()
            moveTo(6f, 14.25f)
            curveTo(6f, 14.664f, 6.336f, 15f, 6.75f, 15f)
            horizontalLineTo(11.25f)
            curveTo(11.664f, 15f, 12f, 14.664f, 12f, 14.25f)
            curveTo(12f, 13.836f, 11.664f, 13.5f, 11.25f, 13.5f)
            horizontalLineTo(6.75f)
            curveTo(6.336f, 13.5f, 6f, 13.836f, 6f, 14.25f)
            close()
            moveTo(21f, 7.511f)
            curveTo(21.902f, 8.089f, 22.5f, 9.1f, 22.5f, 10.25f)
            verticalLineTo(16.25f)
            curveTo(22.5f, 19.149f, 20.149f, 21.5f, 17.25f, 21.5f)
            horizontalLineTo(8.25f)
            curveTo(7.1f, 21.5f, 6.089f, 20.902f, 5.511f, 20f)
            lineTo(17.25f, 20f)
            curveTo(19.321f, 20f, 21f, 18.321f, 21f, 16.25f)
            lineTo(21f, 7.511f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun SlideTextMultiplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.SlideTextMultiple, contentDescription = null)
    }
}
