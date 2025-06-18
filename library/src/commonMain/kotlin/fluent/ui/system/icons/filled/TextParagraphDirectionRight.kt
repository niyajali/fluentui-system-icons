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

public val FluentIcons.Filled.TextParagraphDirectionRight: ImageVector by
    lazy(LazyThreadSafetyMode.NONE) {
        ImageVector.Builder(
            name = "Filled.TextParagraphDirectionRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(8f, 8.5f)
                curveTo(8f, 5.462f, 10.462f, 3f, 13.5f, 3f)
                horizontalLineTo(20.045f)
                curveTo(20.573f, 3f, 21f, 3.336f, 21f, 3.75f)
                curveTo(21f, 4.13f, 20.641f, 4.443f, 20.175f, 4.493f)
                lineTo(20.045f, 4.5f)
                horizontalLineTo(19.5f)
                verticalLineTo(21.208f)
                curveTo(19.5f, 21.645f, 19.164f, 22f, 18.75f, 22f)
                curveTo(18.336f, 22f, 18f, 21.645f, 18f, 21.208f)
                verticalLineTo(4.5f)
                horizontalLineTo(16.5f)
                verticalLineTo(21.208f)
                curveTo(16.5f, 21.645f, 16.164f, 22f, 15.75f, 22f)
                curveTo(15.336f, 22f, 15f, 21.645f, 15f, 21.208f)
                verticalLineTo(14f)
                horizontalLineTo(13.5f)
                curveTo(10.462f, 14f, 8f, 11.538f, 8f, 8.5f)
                close()
                moveTo(4.08f, 14.858f)
                curveTo(3.824f, 15.059f, 3.453f, 15.048f, 3.209f, 14.818f)
                curveTo(2.941f, 14.565f, 2.929f, 14.142f, 3.182f, 13.874f)
                lineTo(4.896f, 12f)
                lineTo(3.182f, 10.126f)
                lineTo(3.12f, 10.049f)
                curveTo(2.933f, 9.782f, 2.966f, 9.412f, 3.209f, 9.182f)
                curveTo(3.477f, 8.929f, 3.9f, 8.941f, 4.153f, 9.209f)
                lineTo(6.299f, 11.542f)
                lineTo(6.364f, 11.623f)
                curveTo(6.539f, 11.878f, 6.517f, 12.227f, 6.299f, 12.458f)
                lineTo(4.153f, 14.791f)
                lineTo(4.08f, 14.858f)
                close()
            }
        }.build()
    }

@Preview
@Composable
private fun TextParagraphDirectionRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TextParagraphDirectionRight, contentDescription = null)
    }
}
