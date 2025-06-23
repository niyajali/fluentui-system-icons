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

public val FluentIcons.Filled.MailDataBar: ImageVector
    get() {
        if (_MailDataBar != null) {
            return _MailDataBar!!
        }
        _MailDataBar = ImageVector.Builder(
            name = "Filled.MailDataBar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(22f, 8.608f)
                verticalLineTo(12.05f)
                curveTo(21.838f, 12.017f, 21.671f, 12f, 21.5f, 12f)
                curveTo(20.937f, 12f, 20.418f, 12.186f, 20f, 12.5f)
                curveTo(20f, 11.566f, 19.487f, 10.751f, 18.728f, 10.322f)
                lineTo(22f, 8.608f)
                close()
                moveTo(5.25f, 20f)
                horizontalLineTo(11f)
                verticalLineTo(16.5f)
                curveTo(11f, 15.119f, 12.119f, 14f, 13.5f, 14f)
                curveTo(14.063f, 14f, 14.582f, 14.186f, 15f, 14.5f)
                verticalLineTo(12.5f)
                curveTo(15f, 12.422f, 15.003f, 12.345f, 15.01f, 12.27f)
                lineTo(12.348f, 13.664f)
                curveTo(12.13f, 13.778f, 11.87f, 13.778f, 11.652f, 13.664f)
                lineTo(2f, 8.608f)
                verticalLineTo(16.75f)
                lineTo(2.005f, 16.934f)
                curveTo(2.101f, 18.643f, 3.517f, 20f, 5.25f, 20f)
                close()
                moveTo(5.25f, 4f)
                horizontalLineTo(18.75f)
                curveTo(20.435f, 4f, 21.82f, 5.282f, 21.984f, 6.924f)
                lineTo(12f, 12.153f)
                lineTo(2.016f, 6.924f)
                curveTo(2.174f, 5.343f, 3.464f, 4.095f, 5.064f, 4.005f)
                lineTo(5.25f, 4f)
                close()
                moveTo(17.5f, 11f)
                curveTo(16.672f, 11f, 16f, 11.672f, 16f, 12.5f)
                verticalLineTo(20.5f)
                curveTo(16f, 21.328f, 16.672f, 22f, 17.5f, 22f)
                curveTo(18.328f, 22f, 19f, 21.328f, 19f, 20.5f)
                verticalLineTo(12.5f)
                curveTo(19f, 11.672f, 18.328f, 11f, 17.5f, 11f)
                close()
                moveTo(21.5f, 13f)
                curveTo(20.672f, 13f, 20f, 13.672f, 20f, 14.5f)
                verticalLineTo(20.5f)
                curveTo(20f, 21.328f, 20.672f, 22f, 21.5f, 22f)
                curveTo(22.328f, 22f, 23f, 21.328f, 23f, 20.5f)
                verticalLineTo(14.5f)
                curveTo(23f, 13.672f, 22.328f, 13f, 21.5f, 13f)
                close()
                moveTo(12f, 16.5f)
                curveTo(12f, 15.672f, 12.672f, 15f, 13.5f, 15f)
                curveTo(14.328f, 15f, 15f, 15.672f, 15f, 16.5f)
                verticalLineTo(20.5f)
                curveTo(15f, 21.328f, 14.328f, 22f, 13.5f, 22f)
                curveTo(12.672f, 22f, 12f, 21.328f, 12f, 20.5f)
                verticalLineTo(16.5f)
                close()
            }
        }.build()

        return _MailDataBar!!
    }

@Suppress("ObjectPropertyName")
private var _MailDataBar: ImageVector? = null

@Preview
@Composable
private fun MailDataBarPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.MailDataBar, contentDescription = null)
    }
}
