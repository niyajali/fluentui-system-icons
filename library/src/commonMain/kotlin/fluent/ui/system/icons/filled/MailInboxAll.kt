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

public val FluentIcons.Filled.MailInboxAll: ImageVector
    get() {
        if (_MailInboxAll != null) {
            return _MailInboxAll!!
        }
        _MailInboxAll = ImageVector.Builder(
            name = "Filled.MailInboxAll",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(17.75f, 3f)
                curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(21f, 19.545f, 19.545f, 21f, 17.75f, 21f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
                horizontalLineTo(17.75f)
                close()
                moveTo(17.75f, 4.5f)
                horizontalLineTo(6.25f)
                curveTo(5.284f, 4.5f, 4.5f, 5.284f, 4.5f, 6.25f)
                verticalLineTo(13f)
                horizontalLineTo(9f)
                curveTo(9.38f, 13f, 9.693f, 13.282f, 9.743f, 13.648f)
                lineTo(9.75f, 13.75f)
                curveTo(9.75f, 14.993f, 10.757f, 16f, 12f, 16f)
                curveTo(13.191f, 16f, 14.166f, 15.075f, 14.245f, 13.904f)
                lineTo(14.25f, 13.75f)
                curveTo(14.25f, 13.336f, 14.586f, 13f, 15f, 13f)
                horizontalLineTo(19.5f)
                verticalLineTo(6.25f)
                curveTo(19.5f, 5.332f, 18.793f, 4.579f, 17.893f, 4.506f)
                lineTo(17.75f, 4.5f)
                close()
                moveTo(6.75f, 9.5f)
                horizontalLineTo(17.25f)
                curveTo(17.664f, 9.5f, 18f, 9.836f, 18f, 10.25f)
                curveTo(18f, 10.63f, 17.718f, 10.943f, 17.352f, 10.993f)
                lineTo(17.25f, 11f)
                horizontalLineTo(6.75f)
                curveTo(6.336f, 11f, 6f, 10.664f, 6f, 10.25f)
                curveTo(6f, 9.87f, 6.282f, 9.557f, 6.648f, 9.507f)
                lineTo(6.75f, 9.5f)
                horizontalLineTo(17.25f)
                horizontalLineTo(6.75f)
                close()
                moveTo(6.75f, 6.5f)
                horizontalLineTo(17.25f)
                curveTo(17.664f, 6.5f, 18f, 6.836f, 18f, 7.25f)
                curveTo(18f, 7.63f, 17.718f, 7.943f, 17.352f, 7.993f)
                lineTo(17.25f, 8f)
                horizontalLineTo(6.75f)
                curveTo(6.336f, 8f, 6f, 7.664f, 6f, 7.25f)
                curveTo(6f, 6.87f, 6.282f, 6.557f, 6.648f, 6.507f)
                lineTo(6.75f, 6.5f)
                horizontalLineTo(17.25f)
                horizontalLineTo(6.75f)
                close()
            }
        }.build()

        return _MailInboxAll!!
    }

@Suppress("ObjectPropertyName")
private var _MailInboxAll: ImageVector? = null

@Preview
@Composable
private fun MailInboxAllPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.MailInboxAll, contentDescription = null)
    }
}
