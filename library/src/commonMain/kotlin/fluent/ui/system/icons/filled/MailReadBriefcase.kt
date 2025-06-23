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

public val FluentIcons.Filled.MailReadBriefcase: ImageVector
    get() {
        if (_MailReadBriefcase != null) {
            return _MailReadBriefcase!!
        }
        _MailReadBriefcase = ImageVector.Builder(
            name = "Filled.MailReadBriefcase",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(10.809f, 2.339f)
                curveTo(11.538f, 1.884f, 12.462f, 1.884f, 13.191f, 2.339f)
                lineTo(20.941f, 7.173f)
                curveTo(21.018f, 7.221f, 21.091f, 7.273f, 21.161f, 7.329f)
                lineTo(16.085f, 10f)
                horizontalLineTo(15.75f)
                curveTo(14.701f, 10f, 13.788f, 10.588f, 13.325f, 11.452f)
                lineTo(12f, 12.149f)
                lineTo(2.834f, 7.333f)
                curveTo(2.905f, 7.276f, 2.981f, 7.222f, 3.059f, 7.173f)
                lineTo(10.809f, 2.339f)
                close()
                moveTo(11.651f, 13.661f)
                curveTo(11.686f, 13.679f, 11.722f, 13.694f, 11.758f, 13.707f)
                curveTo(11.291f, 14.161f, 11f, 14.797f, 11f, 15.5f)
                verticalLineTo(20f)
                horizontalLineTo(5.25f)
                curveTo(3.455f, 20f, 2f, 18.545f, 2f, 16.75f)
                verticalLineTo(9.082f)
                curveTo(2f, 8.923f, 2.017f, 8.767f, 2.049f, 8.615f)
                lineTo(11.651f, 13.661f)
                close()
                moveTo(19.305f, 10f)
                curveTo(20.795f, 10.03f, 21.994f, 11.243f, 22f, 12.738f)
                verticalLineTo(9.082f)
                curveTo(22f, 8.921f, 21.983f, 8.763f, 21.95f, 8.609f)
                lineTo(19.305f, 10f)
                close()
                moveTo(14f, 14f)
                horizontalLineTo(13.5f)
                curveTo(12.672f, 14f, 12f, 14.672f, 12f, 15.5f)
                verticalLineTo(20.5f)
                curveTo(12f, 21.328f, 12.672f, 22f, 13.5f, 22f)
                horizontalLineTo(21.5f)
                curveTo(22.328f, 22f, 23f, 21.328f, 23f, 20.5f)
                verticalLineTo(15.5f)
                curveTo(23f, 14.672f, 22.328f, 14f, 21.5f, 14f)
                horizontalLineTo(21f)
                verticalLineTo(12.75f)
                curveTo(21f, 11.783f, 20.216f, 11f, 19.25f, 11f)
                horizontalLineTo(15.75f)
                curveTo(14.783f, 11f, 14f, 11.783f, 14f, 12.75f)
                verticalLineTo(14f)
                close()
                moveTo(15.5f, 12.75f)
                curveTo(15.5f, 12.612f, 15.612f, 12.5f, 15.75f, 12.5f)
                horizontalLineTo(19.25f)
                curveTo(19.388f, 12.5f, 19.5f, 12.612f, 19.5f, 12.75f)
                verticalLineTo(14f)
                horizontalLineTo(15.5f)
                verticalLineTo(12.75f)
                close()
            }
        }.build()

        return _MailReadBriefcase!!
    }

@Suppress("ObjectPropertyName")
private var _MailReadBriefcase: ImageVector? = null

@Preview
@Composable
private fun MailReadBriefcasePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.MailReadBriefcase, contentDescription = null)
    }
}
