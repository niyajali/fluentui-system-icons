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

public val FluentIcons.Regular.GiftCardMoney: ImageVector
    get() {
        if (_GiftCardMoney != null) {
            return _GiftCardMoney!!
        }
        _GiftCardMoney = ImageVector.Builder(
            name = "Regular.GiftCardMoney",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(2f, 5f)
                curveTo(2f, 3.343f, 3.343f, 2f, 5f, 2f)
                horizontalLineTo(19f)
                curveTo(20.657f, 2f, 22f, 3.343f, 22f, 5f)
                verticalLineTo(14.05f)
                curveTo(21.838f, 14.017f, 21.671f, 14f, 21.5f, 14f)
                horizontalLineTo(20.5f)
                verticalLineTo(9.5f)
                horizontalLineTo(10.561f)
                lineTo(12.28f, 11.22f)
                curveTo(12.573f, 11.513f, 12.573f, 11.987f, 12.28f, 12.28f)
                curveTo(11.987f, 12.573f, 11.513f, 12.573f, 11.22f, 12.28f)
                lineTo(9.5f, 10.561f)
                verticalLineTo(15.5f)
                horizontalLineTo(11.208f)
                curveTo(11.074f, 15.806f, 11f, 16.144f, 11f, 16.5f)
                verticalLineTo(17f)
                horizontalLineTo(5f)
                curveTo(3.343f, 17f, 2f, 15.657f, 2f, 14f)
                verticalLineTo(5f)
                close()
                moveTo(5f, 3.5f)
                curveTo(4.172f, 3.5f, 3.5f, 4.172f, 3.5f, 5f)
                verticalLineTo(8f)
                horizontalLineTo(4.708f)
                curveTo(4.574f, 7.694f, 4.5f, 7.356f, 4.5f, 7f)
                curveTo(4.5f, 5.619f, 5.619f, 4.5f, 7f, 4.5f)
                curveTo(7.356f, 4.5f, 7.694f, 4.574f, 8f, 4.708f)
                verticalLineTo(3.5f)
                horizontalLineTo(5f)
                close()
                moveTo(9.5f, 3.5f)
                verticalLineTo(4.708f)
                curveTo(9.806f, 4.574f, 10.144f, 4.5f, 10.5f, 4.5f)
                curveTo(11.881f, 4.5f, 13f, 5.619f, 13f, 7f)
                curveTo(13f, 7.356f, 12.926f, 7.694f, 12.792f, 8f)
                horizontalLineTo(20.5f)
                verticalLineTo(5f)
                curveTo(20.5f, 4.172f, 19.828f, 3.5f, 19f, 3.5f)
                horizontalLineTo(9.5f)
                close()
                moveTo(8f, 15.5f)
                verticalLineTo(10.561f)
                lineTo(6.28f, 12.28f)
                curveTo(5.987f, 12.573f, 5.513f, 12.573f, 5.22f, 12.28f)
                curveTo(4.927f, 11.987f, 4.927f, 11.513f, 5.22f, 11.22f)
                lineTo(6.939f, 9.5f)
                horizontalLineTo(3.5f)
                verticalLineTo(14f)
                curveTo(3.5f, 14.828f, 4.172f, 15.5f, 5f, 15.5f)
                horizontalLineTo(8f)
                close()
                moveTo(10.5f, 8f)
                curveTo(11.052f, 8f, 11.5f, 7.552f, 11.5f, 7f)
                curveTo(11.5f, 6.448f, 11.052f, 6f, 10.5f, 6f)
                curveTo(9.948f, 6f, 9.5f, 6.448f, 9.5f, 7f)
                verticalLineTo(8f)
                horizontalLineTo(10.5f)
                close()
                moveTo(8f, 6.996f)
                curveTo(7.998f, 6.445f, 7.551f, 6f, 7f, 6f)
                curveTo(6.448f, 6f, 6f, 6.448f, 6f, 7f)
                curveTo(6f, 7.552f, 6.448f, 8f, 7f, 8f)
                horizontalLineTo(8f)
                verticalLineTo(6.996f)
                close()
                moveTo(12f, 16.5f)
                curveTo(12f, 15.672f, 12.672f, 15f, 13.5f, 15f)
                horizontalLineTo(21.5f)
                curveTo(22.328f, 15f, 23f, 15.672f, 23f, 16.5f)
                verticalLineTo(20.5f)
                curveTo(23f, 21.328f, 22.328f, 22f, 21.5f, 22f)
                horizontalLineTo(13.5f)
                curveTo(12.672f, 22f, 12f, 21.328f, 12f, 20.5f)
                verticalLineTo(16.5f)
                close()
                moveTo(22f, 17f)
                curveTo(21.448f, 17f, 21f, 16.552f, 21f, 16f)
                horizontalLineTo(20f)
                curveTo(20f, 17.105f, 20.895f, 18f, 22f, 18f)
                verticalLineTo(17f)
                close()
                moveTo(22f, 19f)
                curveTo(20.895f, 19f, 20f, 19.895f, 20f, 21f)
                horizontalLineTo(21f)
                curveTo(21f, 20.448f, 21.448f, 20f, 22f, 20f)
                verticalLineTo(19f)
                close()
                moveTo(14f, 16f)
                curveTo(14f, 16.552f, 13.552f, 17f, 13f, 17f)
                verticalLineTo(18f)
                curveTo(14.105f, 18f, 15f, 17.105f, 15f, 16f)
                horizontalLineTo(14f)
                close()
                moveTo(15f, 21f)
                curveTo(15f, 19.895f, 14.105f, 19f, 13f, 19f)
                verticalLineTo(20f)
                curveTo(13.552f, 20f, 14f, 20.448f, 14f, 21f)
                horizontalLineTo(15f)
                close()
                moveTo(19.25f, 18.5f)
                curveTo(19.25f, 17.534f, 18.466f, 16.75f, 17.5f, 16.75f)
                curveTo(16.534f, 16.75f, 15.75f, 17.534f, 15.75f, 18.5f)
                curveTo(15.75f, 19.466f, 16.534f, 20.25f, 17.5f, 20.25f)
                curveTo(18.466f, 20.25f, 19.25f, 19.466f, 19.25f, 18.5f)
                close()
            }
        }.build()

        return _GiftCardMoney!!
    }

@Suppress("ObjectPropertyName")
private var _GiftCardMoney: ImageVector? = null

@Preview
@Composable
private fun GiftCardMoneyPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.GiftCardMoney, contentDescription = null)
    }
}
