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
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Filled.MailRead: ImageVector
    get() {
        if (_MailRead != null) {
            return _MailRead!!
        }
        _MailRead = ImageVector.Builder(
            name = "Filled.MailRead",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(10.809f, 2.339f)
                curveTo(11.538f, 1.885f, 12.462f, 1.885f, 13.191f, 2.339f)
                lineTo(20.941f, 7.173f)
                curveTo(21.018f, 7.221f, 21.091f, 7.274f, 21.161f, 7.33f)
                lineTo(12f, 12.15f)
                lineTo(2.834f, 7.333f)
                curveTo(2.905f, 7.276f, 2.981f, 7.222f, 3.059f, 7.173f)
                lineTo(10.809f, 2.339f)
                close()
                moveTo(2.049f, 8.615f)
                curveTo(2.017f, 8.767f, 2f, 8.924f, 2f, 9.082f)
                verticalLineTo(16.75f)
                curveTo(2f, 18.545f, 3.455f, 20f, 5.25f, 20f)
                horizontalLineTo(18.75f)
                curveTo(20.545f, 20f, 22f, 18.545f, 22f, 16.75f)
                verticalLineTo(9.082f)
                curveTo(22f, 8.922f, 21.983f, 8.763f, 21.95f, 8.61f)
                lineTo(12.349f, 13.661f)
                curveTo(12.131f, 13.776f, 11.87f, 13.776f, 11.651f, 13.661f)
                lineTo(2.049f, 8.615f)
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
        Image(imageVector = FluentIcons.Filled.MailRead, contentDescription = null)
    }
}
