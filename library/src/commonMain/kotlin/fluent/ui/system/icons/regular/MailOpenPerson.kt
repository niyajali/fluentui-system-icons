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

public val FluentIcons.Regular.MailOpenPerson: ImageVector
    get() {
        if (_MailOpenPerson != null) {
            return _MailOpenPerson!!
        }
        _MailOpenPerson = ImageVector.Builder(
            name = "Regular.MailOpenPerson",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12f, 3.619f)
                verticalLineTo(3.623f)
                lineTo(3.908f, 8.433f)
                lineTo(12f, 12.654f)
                verticalLineTo(12.657f)
                lineTo(20.231f, 8.432f)
                lineTo(12f, 3.619f)
                close()
                moveTo(11.832f, 14.231f)
                curveTo(11.823f, 14.229f, 11.814f, 14.227f, 11.805f, 14.224f)
                curveTo(11.792f, 14.221f, 11.778f, 14.217f, 11.765f, 14.212f)
                curveTo(11.723f, 14.199f, 11.683f, 14.181f, 11.644f, 14.16f)
                lineTo(3.5f, 9.91f)
                verticalLineTo(16.75f)
                curveTo(3.5f, 17.668f, 4.207f, 18.421f, 5.106f, 18.494f)
                lineTo(5.25f, 18.5f)
                horizontalLineTo(13.308f)
                curveTo(13.111f, 18.881f, 13f, 19.313f, 13f, 19.772f)
                verticalLineTo(19.875f)
                curveTo(13f, 19.917f, 13.001f, 19.958f, 13.002f, 20f)
                horizontalLineTo(5.25f)
                curveTo(3.517f, 20f, 2.101f, 18.644f, 2.005f, 16.934f)
                lineTo(2f, 16.75f)
                verticalLineTo(9.103f)
                curveTo(2f, 8.366f, 2.36f, 7.68f, 2.958f, 7.261f)
                lineTo(3.1f, 7.169f)
                lineTo(11.604f, 2.113f)
                curveTo(11.648f, 2.086f, 11.695f, 2.063f, 11.744f, 2.045f)
                curveTo(11.783f, 2.031f, 11.824f, 2.02f, 11.864f, 2.012f)
                curveTo(12.035f, 1.981f, 12.217f, 2.008f, 12.379f, 2.103f)
                lineTo(21.382f, 7.368f)
                curveTo(22.233f, 7.866f, 22.199f, 9.108f, 21.322f, 9.559f)
                lineTo(18.513f, 11f)
                lineTo(18.5f, 11f)
                curveTo(17.324f, 11f, 16.283f, 11.58f, 15.648f, 12.471f)
                lineTo(12.342f, 14.167f)
                curveTo(12.179f, 14.251f, 11.998f, 14.269f, 11.832f, 14.231f)
                close()
                moveTo(21f, 14.5f)
                curveTo(21f, 15.881f, 19.881f, 17f, 18.5f, 17f)
                curveTo(17.119f, 17f, 16f, 15.881f, 16f, 14.5f)
                curveTo(16f, 13.119f, 17.119f, 12f, 18.5f, 12f)
                curveTo(19.881f, 12f, 21f, 13.119f, 21f, 14.5f)
                close()
                moveTo(23f, 19.875f)
                curveTo(23f, 21.432f, 21.714f, 23f, 18.5f, 23f)
                curveTo(15.286f, 23f, 14f, 21.438f, 14f, 19.875f)
                verticalLineTo(19.772f)
                curveTo(14f, 18.793f, 14.794f, 18f, 15.773f, 18f)
                horizontalLineTo(21.227f)
                curveTo(22.206f, 18f, 23f, 18.793f, 23f, 19.772f)
                verticalLineTo(19.875f)
                close()
            }
        }.build()

        return _MailOpenPerson!!
    }

@Suppress("ObjectPropertyName")
private var _MailOpenPerson: ImageVector? = null

@Preview
@Composable
private fun MailOpenPersonPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.MailOpenPerson, contentDescription = null)
    }
}
