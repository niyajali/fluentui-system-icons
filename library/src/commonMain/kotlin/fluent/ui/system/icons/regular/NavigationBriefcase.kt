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

public val FluentIcons.Regular.NavigationBriefcase: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.NavigationBriefcase",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2.751f, 18f)
            horizontalLineTo(12f)
            verticalLineTo(19.5f)
            horizontalLineTo(2.751f)
            curveTo(2.337f, 19.5f, 2.001f, 19.164f, 2.001f, 18.75f)
            curveTo(2.001f, 18.37f, 2.283f, 18.056f, 2.649f, 18.007f)
            lineTo(2.751f, 18f)
            close()
            moveTo(2.751f, 13.003f)
            horizontalLineTo(14.103f)
            curveTo(14.276f, 12.389f, 14.657f, 11.862f, 15.165f, 11.503f)
            horizontalLineTo(2.751f)
            lineTo(2.649f, 11.509f)
            curveTo(2.283f, 11.559f, 2.001f, 11.873f, 2.001f, 12.253f)
            curveTo(2.001f, 12.667f, 2.337f, 13.003f, 2.751f, 13.003f)
            close()
            moveTo(2.75f, 5.003f)
            horizontalLineTo(21.25f)
            curveTo(21.664f, 5.003f, 22f, 5.339f, 22f, 5.753f)
            curveTo(22f, 6.133f, 21.718f, 6.446f, 21.352f, 6.496f)
            lineTo(21.25f, 6.503f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 6.503f, 2f, 6.167f, 2f, 5.753f)
            curveTo(2f, 5.373f, 2.282f, 5.059f, 2.648f, 5.01f)
            lineTo(2.75f, 5.003f)
            close()
            moveTo(15f, 15f)
            verticalLineTo(13.75f)
            curveTo(15f, 12.783f, 15.783f, 12f, 16.75f, 12f)
            horizontalLineTo(20.25f)
            curveTo(21.216f, 12f, 22f, 12.783f, 22f, 13.75f)
            verticalLineTo(15f)
            horizontalLineTo(22.5f)
            curveTo(23.328f, 15f, 24f, 15.672f, 24f, 16.5f)
            verticalLineTo(21.5f)
            curveTo(24f, 22.328f, 23.328f, 23f, 22.5f, 23f)
            horizontalLineTo(14.5f)
            curveTo(13.672f, 23f, 13f, 22.328f, 13f, 21.5f)
            verticalLineTo(16.5f)
            curveTo(13f, 15.672f, 13.672f, 15f, 14.5f, 15f)
            horizontalLineTo(15f)
            close()
            moveTo(16.5f, 13.75f)
            verticalLineTo(15f)
            horizontalLineTo(20.5f)
            verticalLineTo(13.75f)
            curveTo(20.5f, 13.612f, 20.388f, 13.5f, 20.25f, 13.5f)
            horizontalLineTo(16.75f)
            curveTo(16.612f, 13.5f, 16.5f, 13.612f, 16.5f, 13.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun NavigationBriefcasePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.NavigationBriefcase, contentDescription = null)
    }
}
