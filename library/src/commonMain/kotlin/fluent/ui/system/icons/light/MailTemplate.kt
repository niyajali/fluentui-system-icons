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

public val FluentIcons.Light.MailTemplate: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.MailTemplate",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(25.5f, 15f)
            curveTo(27.985f, 15f, 30f, 17.015f, 30f, 19.5f)
            verticalLineTo(25.5f)
            curveTo(30f, 27.985f, 27.985f, 30f, 25.5f, 30f)
            horizontalLineTo(15.5f)
            curveTo(13.015f, 30f, 11f, 27.985f, 11f, 25.5f)
            verticalLineTo(19.5f)
            curveTo(11f, 17.015f, 13.015f, 15f, 15.5f, 15f)
            horizontalLineTo(25.5f)
            close()
            moveTo(20.765f, 24.423f)
            curveTo(20.602f, 24.526f, 20.394f, 24.526f, 20.231f, 24.423f)
            lineTo(12.012f, 19.23f)
            curveTo(12.005f, 19.319f, 12f, 19.409f, 12f, 19.5f)
            verticalLineTo(25.5f)
            curveTo(12f, 27.433f, 13.567f, 29f, 15.5f, 29f)
            horizontalLineTo(25.5f)
            curveTo(27.433f, 29f, 29f, 27.433f, 29f, 25.5f)
            verticalLineTo(19.5f)
            curveTo(29f, 19.409f, 28.994f, 19.318f, 28.987f, 19.229f)
            lineTo(20.765f, 24.423f)
            close()
            moveTo(22.731f, 2.006f)
            curveTo(25.109f, 2.126f, 27f, 4.092f, 27f, 6.5f)
            verticalLineTo(13.689f)
            curveTo(26.676f, 13.606f, 26.342f, 13.55f, 26f, 13.521f)
            verticalLineTo(6.5f)
            curveTo(26f, 4.627f, 24.529f, 3.098f, 22.68f, 3.005f)
            lineTo(22.5f, 3f)
            horizontalLineTo(6.5f)
            curveTo(4.567f, 3f, 3f, 4.567f, 3f, 6.5f)
            verticalLineTo(22.5f)
            lineTo(3.005f, 22.68f)
            curveTo(3.098f, 24.529f, 4.627f, 26f, 6.5f, 26f)
            horizontalLineTo(9.522f)
            curveTo(9.551f, 26.342f, 9.605f, 26.677f, 9.688f, 27f)
            horizontalLineTo(6.5f)
            curveTo(4.092f, 27f, 2.126f, 25.109f, 2.006f, 22.731f)
            lineTo(2f, 22.5f)
            verticalLineTo(6.5f)
            curveTo(2f, 4.015f, 4.015f, 2f, 6.5f, 2f)
            horizontalLineTo(22.5f)
            lineTo(22.731f, 2.006f)
            close()
            moveTo(15.5f, 16f)
            curveTo(14.027f, 16f, 12.766f, 16.91f, 12.25f, 18.199f)
            lineTo(20.498f, 23.408f)
            lineTo(28.748f, 18.197f)
            curveTo(28.231f, 16.91f, 26.972f, 16f, 25.5f, 16f)
            horizontalLineTo(15.5f)
            close()
            moveTo(21.5f, 11f)
            curveTo(21.776f, 11f, 22f, 11.224f, 22f, 11.5f)
            curveTo(22f, 11.776f, 21.776f, 12f, 21.5f, 12f)
            horizontalLineTo(11.5f)
            curveTo(11.224f, 12f, 11f, 11.776f, 11f, 11.5f)
            curveTo(11f, 11.224f, 11.224f, 11f, 11.5f, 11f)
            horizontalLineTo(21.5f)
            close()
            moveTo(21.5f, 7f)
            curveTo(21.776f, 7f, 22f, 7.224f, 22f, 7.5f)
            curveTo(22f, 7.776f, 21.776f, 8f, 21.5f, 8f)
            horizontalLineTo(7.5f)
            curveTo(7.224f, 8f, 7f, 7.776f, 7f, 7.5f)
            curveTo(7f, 7.224f, 7.224f, 7f, 7.5f, 7f)
            horizontalLineTo(21.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun MailTemplatePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Light.MailTemplate, contentDescription = null)
    }
}
