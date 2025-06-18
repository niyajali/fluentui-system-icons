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

public val FluentIcons.Regular.GroupDismiss: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.GroupDismiss",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(7f, 5f)
            curveTo(7f, 6.105f, 6.105f, 7f, 5f, 7f)
            curveTo(3.895f, 7f, 3f, 6.105f, 3f, 5f)
            curveTo(3f, 3.895f, 3.895f, 3f, 5f, 3f)
            curveTo(6.105f, 3f, 7f, 3.895f, 7f, 5f)
            close()
            moveTo(21f, 5f)
            curveTo(21f, 6.105f, 20.105f, 7f, 19f, 7f)
            curveTo(17.895f, 7f, 17f, 6.105f, 17f, 5f)
            curveTo(17f, 3.895f, 17.895f, 3f, 19f, 3f)
            curveTo(20.105f, 3f, 21f, 3.895f, 21f, 5f)
            close()
            moveTo(7f, 19f)
            curveTo(7f, 20.105f, 6.105f, 21f, 5f, 21f)
            curveTo(3.895f, 21f, 3f, 20.105f, 3f, 19f)
            curveTo(3f, 17.895f, 3.895f, 17f, 5f, 17f)
            curveTo(6.105f, 17f, 7f, 17.895f, 7f, 19f)
            close()
            moveTo(8f, 5f)
            curveTo(8f, 5.17f, 7.986f, 5.337f, 7.959f, 5.5f)
            horizontalLineTo(12.5f)
            curveTo(13.052f, 5.5f, 13.5f, 5.948f, 13.5f, 6.5f)
            verticalLineTo(9f)
            horizontalLineTo(11.5f)
            curveTo(10.119f, 9f, 9f, 10.119f, 9f, 11.5f)
            verticalLineTo(13.5f)
            horizontalLineTo(6.5f)
            curveTo(5.948f, 13.5f, 5.5f, 13.052f, 5.5f, 12.5f)
            verticalLineTo(7.959f)
            curveTo(5.337f, 7.986f, 5.17f, 8f, 5f, 8f)
            curveTo(4.649f, 8f, 4.313f, 7.94f, 4f, 7.829f)
            verticalLineTo(12.5f)
            curveTo(4f, 13.881f, 5.119f, 15f, 6.5f, 15f)
            horizontalLineTo(9f)
            verticalLineTo(17.5f)
            curveTo(9f, 18.88f, 10.118f, 19.999f, 11.498f, 20f)
            curveTo(11.288f, 19.495f, 11.139f, 18.959f, 11.062f, 18.399f)
            curveTo(10.729f, 18.237f, 10.5f, 17.895f, 10.5f, 17.5f)
            verticalLineTo(11.5f)
            curveTo(10.5f, 10.948f, 10.948f, 10.5f, 11.5f, 10.5f)
            horizontalLineTo(17.5f)
            curveTo(17.895f, 10.5f, 18.237f, 10.729f, 18.399f, 11.062f)
            curveTo(18.959f, 11.139f, 19.495f, 11.288f, 20f, 11.498f)
            curveTo(19.999f, 10.118f, 18.88f, 9f, 17.5f, 9f)
            horizontalLineTo(15f)
            verticalLineTo(6.5f)
            curveTo(15f, 5.119f, 13.881f, 4f, 12.5f, 4f)
            horizontalLineTo(7.829f)
            curveTo(7.94f, 4.313f, 8f, 4.649f, 8f, 5f)
            close()
            moveTo(23f, 17.5f)
            curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
            curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
            curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
            curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
            close()
            moveTo(17.5f, 16.793f)
            lineTo(15.854f, 15.146f)
            curveTo(15.658f, 14.951f, 15.342f, 14.951f, 15.146f, 15.146f)
            curveTo(14.951f, 15.342f, 14.951f, 15.658f, 15.146f, 15.854f)
            lineTo(16.793f, 17.5f)
            lineTo(15.146f, 19.146f)
            curveTo(14.951f, 19.342f, 14.951f, 19.658f, 15.146f, 19.854f)
            curveTo(15.342f, 20.049f, 15.658f, 20.049f, 15.854f, 19.854f)
            lineTo(17.5f, 18.207f)
            lineTo(19.146f, 19.854f)
            curveTo(19.342f, 20.049f, 19.658f, 20.049f, 19.854f, 19.854f)
            curveTo(20.049f, 19.658f, 20.049f, 19.342f, 19.854f, 19.146f)
            lineTo(18.207f, 17.5f)
            lineTo(19.854f, 15.854f)
            curveTo(20.049f, 15.658f, 20.049f, 15.342f, 19.854f, 15.146f)
            curveTo(19.658f, 14.951f, 19.342f, 14.951f, 19.146f, 15.146f)
            lineTo(17.5f, 16.793f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun GroupDismissPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.GroupDismiss, contentDescription = null)
    }
}
