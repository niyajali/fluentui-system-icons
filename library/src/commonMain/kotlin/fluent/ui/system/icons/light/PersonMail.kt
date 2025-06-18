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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Light.PersonMail: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.PersonMail",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(14f, 2f)
            curveTo(10.134f, 2f, 7f, 5.134f, 7f, 9f)
            curveTo(7f, 12.866f, 10.134f, 16f, 14f, 16f)
            curveTo(17.866f, 16f, 21f, 12.866f, 21f, 9f)
            curveTo(21f, 5.134f, 17.866f, 2f, 14f, 2f)
            close()
            moveTo(8f, 9f)
            curveTo(8f, 5.686f, 10.686f, 3f, 14f, 3f)
            curveTo(17.314f, 3f, 20f, 5.686f, 20f, 9f)
            curveTo(20f, 12.314f, 17.314f, 15f, 14f, 15f)
            curveTo(10.686f, 15f, 8f, 12.314f, 8f, 9f)
            close()
            moveTo(5.5f, 18f)
            curveTo(3.567f, 18f, 2f, 19.567f, 2f, 21.5f)
            verticalLineTo(22.167f)
            curveTo(2f, 24.314f, 4.759f, 29.987f, 13.968f, 30f)
            curveTo(13.811f, 29.685f, 13.69f, 29.348f, 13.611f, 28.997f)
            curveTo(5.168f, 28.842f, 3f, 23.661f, 3f, 22.167f)
            verticalLineTo(21.5f)
            curveTo(3f, 20.119f, 4.119f, 19f, 5.5f, 19f)
            horizontalLineTo(13.611f)
            curveTo(13.691f, 18.649f, 13.812f, 18.314f, 13.968f, 18f)
            horizontalLineTo(5.5f)
            close()
            moveTo(18f, 17f)
            curveTo(16.343f, 17f, 15f, 18.343f, 15f, 20f)
            verticalLineTo(20.198f)
            lineTo(23f, 24.642f)
            lineTo(31f, 20.198f)
            verticalLineTo(20f)
            curveTo(31f, 18.343f, 29.657f, 17f, 28f, 17f)
            horizontalLineTo(18f)
            close()
            moveTo(31f, 21.913f)
            lineTo(23.364f, 26.156f)
            curveTo(23.138f, 26.281f, 22.862f, 26.281f, 22.636f, 26.156f)
            lineTo(15f, 21.913f)
            verticalLineTo(28f)
            curveTo(15f, 29.657f, 16.343f, 31f, 18f, 31f)
            horizontalLineTo(28f)
            curveTo(29.657f, 31f, 31f, 29.657f, 31f, 28f)
            verticalLineTo(21.913f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PersonMailPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.PersonMail, contentDescription = null)
    }
}
