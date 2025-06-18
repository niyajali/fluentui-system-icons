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

public val FluentIcons.Regular.DocumentBulletListMultiple: ImageVector by
    lazy(LazyThreadSafetyMode.NONE) {
        ImageVector.Builder(
            name = "Regular.DocumentBulletListMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(7.75f, 11.5f)
                curveTo(7.336f, 11.5f, 7f, 11.836f, 7f, 12.25f)
                curveTo(7f, 12.664f, 7.336f, 13f, 7.75f, 13f)
                curveTo(8.164f, 13f, 8.5f, 12.664f, 8.5f, 12.25f)
                curveTo(8.5f, 11.836f, 8.164f, 11.5f, 7.75f, 11.5f)
                close()
                moveTo(7f, 15.25f)
                curveTo(7f, 14.836f, 7.336f, 14.5f, 7.75f, 14.5f)
                curveTo(8.164f, 14.5f, 8.5f, 14.836f, 8.5f, 15.25f)
                curveTo(8.5f, 15.664f, 8.164f, 16f, 7.75f, 16f)
                curveTo(7.336f, 16f, 7f, 15.664f, 7f, 15.25f)
                close()
                moveTo(10f, 12.25f)
                curveTo(10f, 11.836f, 10.336f, 11.5f, 10.75f, 11.5f)
                horizontalLineTo(13.804f)
                curveTo(14.218f, 11.5f, 14.554f, 11.836f, 14.554f, 12.25f)
                curveTo(14.554f, 12.664f, 14.218f, 13f, 13.804f, 13f)
                horizontalLineTo(10.75f)
                curveTo(10.336f, 13f, 10f, 12.664f, 10f, 12.25f)
                close()
                moveTo(10.75f, 14.5f)
                curveTo(10.336f, 14.5f, 10f, 14.836f, 10f, 15.25f)
                curveTo(10f, 15.664f, 10.336f, 16f, 10.75f, 16f)
                horizontalLineTo(13.804f)
                curveTo(14.218f, 16f, 14.554f, 15.664f, 14.554f, 15.25f)
                curveTo(14.554f, 14.836f, 14.218f, 14.5f, 13.804f, 14.5f)
                horizontalLineTo(10.75f)
                close()
                moveTo(6.25f, 2f)
                curveTo(5.007f, 2f, 4f, 3.007f, 4f, 4.25f)
                verticalLineTo(17.25f)
                curveTo(4f, 18.493f, 5.007f, 19.5f, 6.25f, 19.5f)
                horizontalLineTo(15.25f)
                curveTo(16.493f, 19.5f, 17.5f, 18.493f, 17.5f, 17.25f)
                verticalLineTo(8.869f)
                curveTo(17.5f, 8.272f, 17.263f, 7.7f, 16.841f, 7.278f)
                lineTo(12.222f, 2.659f)
                curveTo(11.8f, 2.237f, 11.228f, 2f, 10.631f, 2f)
                horizontalLineTo(6.25f)
                close()
                moveTo(5.5f, 4.25f)
                curveTo(5.5f, 3.836f, 5.836f, 3.5f, 6.25f, 3.5f)
                horizontalLineTo(10.504f)
                verticalLineTo(6.748f)
                curveTo(10.504f, 7.99f, 11.511f, 8.998f, 12.754f, 8.998f)
                horizontalLineTo(16f)
                verticalLineTo(17.25f)
                curveTo(16f, 17.664f, 15.664f, 18f, 15.25f, 18f)
                horizontalLineTo(6.25f)
                curveTo(5.836f, 18f, 5.5f, 17.664f, 5.5f, 17.25f)
                verticalLineTo(4.25f)
                close()
                moveTo(12.004f, 6.748f)
                verticalLineTo(4.562f)
                lineTo(14.939f, 7.498f)
                horizontalLineTo(12.754f)
                curveTo(12.34f, 7.498f, 12.004f, 7.162f, 12.004f, 6.748f)
                close()
                moveTo(8.751f, 22f)
                curveTo(7.771f, 22f, 6.938f, 21.374f, 6.629f, 20.5f)
                horizontalLineTo(15.251f)
                curveTo(17.046f, 20.5f, 18.501f, 19.045f, 18.501f, 17.25f)
                verticalLineTo(8.937f)
                lineTo(19.342f, 9.778f)
                curveTo(19.764f, 10.2f, 20.001f, 10.772f, 20.001f, 11.369f)
                verticalLineTo(17.25f)
                curveTo(20.001f, 19.873f, 17.874f, 22f, 15.251f, 22f)
                horizontalLineTo(8.751f)
                close()
            }
        }.build()
    }

@Preview
@Composable
private fun DocumentBulletListMultiplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.DocumentBulletListMultiple, contentDescription = null)
    }
}
