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

public val FluentIcons.Regular.OrganizationHorizontal: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.OrganizationHorizontal",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(1.996f, 12.25f)
            curveTo(1.996f, 14.323f, 3.676f, 16.002f, 5.748f, 16.002f)
            curveTo(7.564f, 16.002f, 9.078f, 14.713f, 9.426f, 13f)
            horizontalLineTo(11.498f)
            verticalLineTo(16.25f)
            curveTo(11.498f, 17.493f, 12.506f, 18.5f, 13.748f, 18.5f)
            horizontalLineTo(14.574f)
            curveTo(14.922f, 20.212f, 16.436f, 21.5f, 18.251f, 21.5f)
            curveTo(20.323f, 21.5f, 22.003f, 19.82f, 22.003f, 17.748f)
            curveTo(22.003f, 15.675f, 20.323f, 13.995f, 18.251f, 13.995f)
            curveTo(16.434f, 13.995f, 14.92f, 15.286f, 14.573f, 17f)
            horizontalLineTo(13.748f)
            curveTo(13.334f, 17f, 12.998f, 16.664f, 12.998f, 16.25f)
            verticalLineTo(8.25f)
            curveTo(12.998f, 7.836f, 13.334f, 7.5f, 13.748f, 7.5f)
            horizontalLineTo(14.574f)
            curveTo(14.922f, 9.212f, 16.436f, 10.5f, 18.251f, 10.5f)
            curveTo(20.323f, 10.5f, 22.003f, 8.82f, 22.003f, 6.748f)
            curveTo(22.003f, 4.675f, 20.323f, 2.995f, 18.251f, 2.995f)
            curveTo(16.434f, 2.995f, 14.92f, 4.286f, 14.573f, 6f)
            horizontalLineTo(13.748f)
            curveTo(12.506f, 6f, 11.498f, 7.007f, 11.498f, 8.25f)
            verticalLineTo(11.5f)
            horizontalLineTo(9.426f)
            curveTo(9.078f, 9.787f, 7.564f, 8.498f, 5.748f, 8.498f)
            curveTo(3.676f, 8.498f, 1.996f, 10.178f, 1.996f, 12.25f)
            close()
            moveTo(5.748f, 14.502f)
            curveTo(4.504f, 14.502f, 3.496f, 13.494f, 3.496f, 12.25f)
            curveTo(3.496f, 11.006f, 4.504f, 9.998f, 5.748f, 9.998f)
            curveTo(6.992f, 9.998f, 8.001f, 11.006f, 8.001f, 12.25f)
            curveTo(8.001f, 13.494f, 6.992f, 14.502f, 5.748f, 14.502f)
            close()
            moveTo(18.251f, 20f)
            curveTo(17.007f, 20f, 15.998f, 18.992f, 15.998f, 17.748f)
            curveTo(15.998f, 16.504f, 17.007f, 15.495f, 18.251f, 15.495f)
            curveTo(19.494f, 15.495f, 20.503f, 16.504f, 20.503f, 17.748f)
            curveTo(20.503f, 18.992f, 19.494f, 20f, 18.251f, 20f)
            close()
            moveTo(15.998f, 6.748f)
            curveTo(15.998f, 5.504f, 17.007f, 4.495f, 18.251f, 4.495f)
            curveTo(19.494f, 4.495f, 20.503f, 5.504f, 20.503f, 6.748f)
            curveTo(20.503f, 7.992f, 19.494f, 9f, 18.251f, 9f)
            curveTo(17.007f, 9f, 15.998f, 7.992f, 15.998f, 6.748f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun OrganizationHorizontalPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.OrganizationHorizontal, contentDescription = null)
    }
}
