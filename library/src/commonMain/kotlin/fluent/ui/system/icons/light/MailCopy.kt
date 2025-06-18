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

public val FluentIcons.Light.MailCopy: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.MailCopy",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(9.5f, 5f)
            curveTo(7.015f, 5f, 5f, 7.015f, 5f, 9.5f)
            verticalLineTo(20.5f)
            curveTo(5f, 22.985f, 7.015f, 25f, 9.5f, 25f)
            horizontalLineTo(25.5f)
            curveTo(27.985f, 25f, 30f, 22.985f, 30f, 20.5f)
            verticalLineTo(9.5f)
            curveTo(30f, 7.015f, 27.985f, 5f, 25.5f, 5f)
            horizontalLineTo(9.5f)
            close()
            moveTo(6f, 9.5f)
            curveTo(6f, 7.567f, 7.567f, 6f, 9.5f, 6f)
            horizontalLineTo(25.5f)
            curveTo(27.433f, 6f, 29f, 7.567f, 29f, 9.5f)
            verticalLineTo(9.702f)
            lineTo(17.5f, 15.931f)
            lineTo(6f, 9.702f)
            verticalLineTo(9.5f)
            close()
            moveTo(6f, 10.84f)
            lineTo(17.261f, 16.94f)
            curveTo(17.41f, 17.02f, 17.589f, 17.02f, 17.738f, 16.94f)
            lineTo(29f, 10.84f)
            verticalLineTo(20.5f)
            curveTo(29f, 22.433f, 27.433f, 24f, 25.5f, 24f)
            horizontalLineTo(9.5f)
            curveTo(7.567f, 24f, 6f, 22.433f, 6f, 20.5f)
            verticalLineTo(10.84f)
            close()
            moveTo(2f, 12.5f)
            curveTo(2f, 11.428f, 2.375f, 10.444f, 3f, 9.671f)
            verticalLineTo(20.5f)
            curveTo(3f, 24.09f, 5.91f, 27f, 9.5f, 27f)
            horizontalLineTo(25.329f)
            curveTo(24.556f, 27.625f, 23.572f, 28f, 22.5f, 28f)
            horizontalLineTo(9.5f)
            curveTo(5.358f, 28f, 2f, 24.642f, 2f, 20.5f)
            verticalLineTo(12.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun MailCopyPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.MailCopy, contentDescription = null)
    }
}
