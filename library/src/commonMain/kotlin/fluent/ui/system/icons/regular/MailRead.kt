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
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Regular.MailRead: ImageVector
    get() {
        if (_MailRead != null) {
            return _MailRead!!
        }
        _MailRead = ImageVector.Builder(
            name = "Regular.MailRead",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(13.191f, 2.339f)
                curveTo(12.462f, 1.885f, 11.538f, 1.885f, 10.809f, 2.339f)
                lineTo(3.059f, 7.173f)
                curveTo(2.4f, 7.584f, 2f, 8.306f, 2f, 9.082f)
                verticalLineTo(16.75f)
                curveTo(2f, 18.545f, 3.455f, 20f, 5.25f, 20f)
                horizontalLineTo(18.75f)
                curveTo(20.545f, 20f, 22f, 18.545f, 22f, 16.75f)
                verticalLineTo(9.082f)
                curveTo(22f, 8.306f, 21.6f, 7.584f, 20.941f, 7.173f)
                lineTo(13.191f, 2.339f)
                close()
                moveTo(11.603f, 3.612f)
                curveTo(11.846f, 3.46f, 12.154f, 3.46f, 12.397f, 3.612f)
                lineTo(19.639f, 8.129f)
                lineTo(12f, 12.149f)
                lineTo(4.361f, 8.129f)
                lineTo(11.603f, 3.612f)
                close()
                moveTo(3.5f, 9.371f)
                lineTo(11.651f, 13.661f)
                curveTo(11.869f, 13.776f, 12.131f, 13.776f, 12.349f, 13.661f)
                lineTo(20.5f, 9.371f)
                verticalLineTo(16.75f)
                curveTo(20.5f, 17.716f, 19.716f, 18.5f, 18.75f, 18.5f)
                horizontalLineTo(5.25f)
                curveTo(4.284f, 18.5f, 3.5f, 17.716f, 3.5f, 16.75f)
                verticalLineTo(9.371f)
                close()
            }
        }.build()

        return _MailRead!!
    }

@Suppress("ObjectPropertyName")
private var _MailRead: ImageVector? = null

@Preview
@Composable
private fun MailReadPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.MailRead, contentDescription = null)
    }
}
