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
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

/**
 * Wallet icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: wallet
 * - Source: ic_fluent_wallet_24_regular.svg
 * 
 * @return The [ImageVector] for the Wallet icon.
 */
public val FluentIcons.Regular.Wallet: ImageVector
    get() {
        if (_wallet != null) {
            return _wallet!!
        }
        _wallet = Builder(name = "Wallet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.5f, 13.75f)
                curveTo(15.5f, 13.336f, 15.836f, 13.0f, 16.25f, 13.0f)
                horizontalLineTo(18.25f)
                curveTo(18.664f, 13.0f, 19.0f, 13.336f, 19.0f, 13.75f)
                curveTo(19.0f, 14.164f, 18.664f, 14.5f, 18.25f, 14.5f)
                horizontalLineTo(16.25f)
                curveTo(15.836f, 14.5f, 15.5f, 14.164f, 15.5f, 13.75f)
                close()
                moveTo(3.0f, 5.0f)
                horizontalLineTo(3.014f)
                curveTo(3.138f, 3.875f, 4.092f, 3.0f, 5.25f, 3.0f)
                horizontalLineTo(16.75f)
                curveTo(17.993f, 3.0f, 19.0f, 4.007f, 19.0f, 5.25f)
                verticalLineTo(6.087f)
                curveTo(20.433f, 6.426f, 21.5f, 7.713f, 21.5f, 9.25f)
                verticalLineTo(17.75f)
                curveTo(21.5f, 19.545f, 20.045f, 21.0f, 18.25f, 21.0f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 21.0f, 3.0f, 19.545f, 3.0f, 17.75f)
                verticalLineTo(5.0f)
                close()
                moveTo(18.25f, 7.5f)
                horizontalLineTo(4.5f)
                verticalLineTo(17.75f)
                curveTo(4.5f, 18.716f, 5.284f, 19.5f, 6.25f, 19.5f)
                horizontalLineTo(18.25f)
                curveTo(19.216f, 19.5f, 20.0f, 18.716f, 20.0f, 17.75f)
                verticalLineTo(9.25f)
                curveTo(20.0f, 8.283f, 19.216f, 7.5f, 18.25f, 7.5f)
                close()
                moveTo(17.5f, 6.0f)
                verticalLineTo(5.25f)
                curveTo(17.5f, 4.836f, 17.164f, 4.5f, 16.75f, 4.5f)
                horizontalLineTo(5.25f)
                curveTo(4.836f, 4.5f, 4.5f, 4.836f, 4.5f, 5.25f)
                curveTo(4.5f, 5.664f, 4.836f, 6.0f, 5.25f, 6.0f)
                horizontalLineTo(17.5f)
                close()
            }
        }
        .build()
        return _wallet!!
    }

@Suppress("ObjectPropertyName")
private var _wallet: ImageVector? = null

@Preview
@Composable
private fun WalletPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Wallet, contentDescription = null)
    }
}

