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

public val FluentIcons.Regular.MailTemplate: ImageVector
    get() {
        if (_MailTemplate != null) {
            return _MailTemplate!!
        }
        _MailTemplate = ImageVector.Builder(
            name = "Regular.MailTemplate",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(2f, 5.25f)
                curveTo(2f, 3.455f, 3.455f, 2f, 5.25f, 2f)
                horizontalLineTo(15.75f)
                curveTo(17.545f, 2f, 19f, 3.455f, 19f, 5.25f)
                verticalLineTo(10.007f)
                curveTo(18.917f, 10.002f, 18.834f, 10f, 18.75f, 10f)
                horizontalLineTo(17.5f)
                verticalLineTo(5.25f)
                curveTo(17.5f, 4.284f, 16.716f, 3.5f, 15.75f, 3.5f)
                horizontalLineTo(5.25f)
                curveTo(4.284f, 3.5f, 3.5f, 4.284f, 3.5f, 5.25f)
                verticalLineTo(16.75f)
                curveTo(3.5f, 17.716f, 4.284f, 18.5f, 5.25f, 18.5f)
                horizontalLineTo(6f)
                verticalLineTo(18.75f)
                curveTo(6f, 19.185f, 6.065f, 19.605f, 6.187f, 20f)
                horizontalLineTo(5.25f)
                curveTo(3.455f, 20f, 2f, 18.545f, 2f, 16.75f)
                verticalLineTo(5.25f)
                close()
                moveTo(6.75f, 5f)
                curveTo(6.336f, 5f, 6f, 5.336f, 6f, 5.75f)
                curveTo(6f, 6.164f, 6.336f, 6.5f, 6.75f, 6.5f)
                horizontalLineTo(14.25f)
                curveTo(14.664f, 6.5f, 15f, 6.164f, 15f, 5.75f)
                curveTo(15f, 5.336f, 14.664f, 5f, 14.25f, 5f)
                horizontalLineTo(6.75f)
                close()
                moveTo(8f, 8.25f)
                curveTo(8f, 7.836f, 8.336f, 7.5f, 8.75f, 7.5f)
                horizontalLineTo(14.25f)
                curveTo(14.664f, 7.5f, 15f, 7.836f, 15f, 8.25f)
                curveTo(15f, 8.664f, 14.664f, 9f, 14.25f, 9f)
                horizontalLineTo(8.75f)
                curveTo(8.336f, 9f, 8f, 8.664f, 8f, 8.25f)
                close()
                moveTo(7f, 14.25f)
                curveTo(7f, 12.455f, 8.455f, 11f, 10.25f, 11f)
                horizontalLineTo(18.75f)
                curveTo(20.545f, 11f, 22f, 12.455f, 22f, 14.25f)
                verticalLineTo(18.75f)
                curveTo(22f, 20.545f, 20.545f, 22f, 18.75f, 22f)
                horizontalLineTo(10.25f)
                curveTo(8.455f, 22f, 7f, 20.545f, 7f, 18.75f)
                verticalLineTo(14.25f)
                close()
                moveTo(10.25f, 12.5f)
                curveTo(9.746f, 12.5f, 9.291f, 12.713f, 8.972f, 13.055f)
                lineTo(14.5f, 16.608f)
                lineTo(20.028f, 13.055f)
                curveTo(19.709f, 12.713f, 19.254f, 12.5f, 18.75f, 12.5f)
                horizontalLineTo(10.25f)
                close()
                moveTo(8.5f, 18.75f)
                curveTo(8.5f, 19.716f, 9.283f, 20.5f, 10.25f, 20.5f)
                horizontalLineTo(18.75f)
                curveTo(19.716f, 20.5f, 20.5f, 19.716f, 20.5f, 18.75f)
                verticalLineTo(14.535f)
                lineTo(14.906f, 18.131f)
                curveTo(14.659f, 18.29f, 14.342f, 18.29f, 14.094f, 18.131f)
                lineTo(8.5f, 14.535f)
                verticalLineTo(18.75f)
                close()
            }
        }.build()

        return _MailTemplate!!
    }

@Suppress("ObjectPropertyName")
private var _MailTemplate: ImageVector? = null

@Preview
@Composable
private fun MailTemplatePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.MailTemplate, contentDescription = null)
    }
}
