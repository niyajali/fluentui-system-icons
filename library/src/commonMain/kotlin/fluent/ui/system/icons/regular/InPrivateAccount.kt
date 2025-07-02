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
 * InPrivateAccount icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: in, private, account
 * - Source: ic_fluent_inprivate_account_24_regular.svg
 * 
 * @return The [ImageVector] for the InPrivateAccount icon.
 */
public val FluentIcons.Regular.InPrivateAccount: ImageVector
    get() {
        if (_inPrivateAccount != null) {
            return _inPrivateAccount!!
        }
        _inPrivateAccount = Builder(name = "InPrivateAccount", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.754f, 14.0f)
                curveTo(18.962f, 14.0f, 19.948f, 14.953f, 20.001f, 16.147f)
                lineTo(20.0f, 16.25f)
                horizontalLineTo(12.0f)
                lineTo(12.0f, 15.499f)
                lineTo(6.253f, 15.5f)
                curveTo(5.839f, 15.5f, 5.504f, 15.835f, 5.504f, 16.249f)
                verticalLineTo(16.826f)
                curveTo(5.504f, 17.362f, 5.695f, 17.88f, 6.043f, 18.288f)
                curveTo(7.296f, 19.755f, 9.262f, 20.501f, 12.0f, 20.501f)
                verticalLineTo(19.75f)
                lineTo(18.642f, 19.751f)
                curveTo(17.081f, 21.257f, 14.852f, 22.001f, 12.0f, 22.001f)
                curveTo(8.854f, 22.001f, 6.468f, 21.096f, 4.902f, 19.262f)
                curveTo(4.322f, 18.583f, 4.004f, 17.719f, 4.004f, 16.826f)
                verticalLineTo(16.249f)
                curveTo(4.004f, 15.007f, 5.011f, 14.0f, 6.253f, 14.0f)
                horizontalLineTo(17.754f)
                close()
                moveTo(19.47f, 18.751f)
                lineTo(12.0f, 18.75f)
                verticalLineTo(17.25f)
                lineTo(19.979f, 17.25f)
                curveTo(19.918f, 17.782f, 19.744f, 18.294f, 19.47f, 18.751f)
                close()
                moveTo(12.0f, 2.0f)
                curveTo(13.636f, 2.0f, 15.088f, 2.785f, 16.0f, 4.0f)
                lineTo(12.0f, 4.0f)
                verticalLineTo(3.5f)
                curveTo(10.067f, 3.5f, 8.5f, 5.067f, 8.5f, 7.0f)
                curveTo(8.5f, 8.933f, 10.067f, 10.5f, 12.0f, 10.5f)
                verticalLineTo(10.0f)
                lineTo(16.0f, 10.001f)
                curveTo(15.087f, 11.215f, 13.635f, 12.0f, 12.0f, 12.0f)
                curveTo(9.239f, 12.0f, 7.0f, 9.761f, 7.0f, 7.0f)
                curveTo(7.0f, 4.239f, 9.239f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(16.975f, 7.501f)
                curveTo(16.923f, 8.029f, 16.788f, 8.533f, 16.584f, 9.001f)
                lineTo(12.0f, 9.0f)
                verticalLineTo(7.5f)
                lineTo(16.975f, 7.501f)
                close()
                moveTo(16.584f, 5.0f)
                curveTo(16.788f, 5.468f, 16.923f, 5.972f, 16.976f, 6.5f)
                lineTo(12.0f, 6.5f)
                verticalLineTo(5.0f)
                lineTo(16.584f, 5.0f)
                close()
            }
        }
        .build()
        return _inPrivateAccount!!
    }

@Suppress("ObjectPropertyName")
private var _inPrivateAccount: ImageVector? = null

@Preview
@Composable
private fun InPrivateAccountPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.InPrivateAccount, contentDescription = null)
    }
}

