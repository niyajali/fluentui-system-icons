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
 * WindowInPrivateAccount Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used to represent general windowed app scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_window_inprivate_account_20_filled.svg)
 * 
 * @return The [ImageVector] for the WindowInPrivateAccount icon.
 */
public val FluentIcons.Filled.WindowInPrivateAccount: ImageVector
    get() {
        if (_windowInPrivateAccount != null) {
            return _windowInPrivateAccount!!
        }
        _windowInPrivateAccount = Builder(name = "WindowInPrivateAccount", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 5.5f)
                curveTo(3.0f, 4.119f, 4.119f, 3.0f, 5.5f, 3.0f)
                horizontalLineTo(14.5f)
                curveTo(15.881f, 3.0f, 17.0f, 4.119f, 17.0f, 5.5f)
                verticalLineTo(6.0f)
                horizontalLineTo(3.003f)
                verticalLineTo(7.0f)
                horizontalLineTo(15.0f)
                curveTo(13.067f, 7.0f, 11.5f, 8.567f, 11.5f, 10.5f)
                curveTo(11.5f, 11.479f, 11.902f, 12.365f, 12.55f, 13.0f)
                curveTo(11.734f, 13.0f, 11.089f, 13.412f, 10.686f, 13.865f)
                curveTo(10.29f, 14.311f, 10.0f, 14.935f, 10.0f, 15.62f)
                verticalLineTo(15.94f)
                curveTo(10.0f, 16.312f, 10.056f, 16.666f, 10.161f, 17.0f)
                horizontalLineTo(5.5f)
                curveTo(4.119f, 17.0f, 3.0f, 15.881f, 3.0f, 14.5f)
                verticalLineTo(5.5f)
                close()
                moveTo(15.0f, 13.0f)
                curveTo(13.619f, 13.0f, 12.5f, 11.881f, 12.5f, 10.5f)
                curveTo(12.5f, 9.119f, 13.619f, 8.0f, 15.0f, 8.0f)
                curveTo(15.818f, 8.0f, 16.544f, 8.393f, 17.0f, 9.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(17.45f)
                curveTo(17.483f, 10.162f, 17.5f, 10.329f, 17.5f, 10.5f)
                curveTo(17.5f, 10.671f, 17.483f, 10.838f, 17.45f, 11.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(17.0f)
                curveTo(16.544f, 12.607f, 15.818f, 13.0f, 15.0f, 13.0f)
                close()
                moveTo(12.55f, 14.0f)
                curveTo(12.085f, 14.0f, 11.695f, 14.235f, 11.434f, 14.529f)
                curveTo(11.175f, 14.82f, 11.0f, 15.215f, 11.0f, 15.62f)
                verticalLineTo(15.94f)
                curveTo(11.0f, 17.574f, 12.633f, 19.0f, 15.0f, 19.0f)
                curveTo(16.241f, 19.0f, 17.28f, 18.608f, 17.988f, 18.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(18.761f)
                curveTo(18.909f, 16.685f, 18.991f, 16.347f, 18.999f, 16.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(18.867f)
                curveTo(18.792f, 14.827f, 18.688f, 14.666f, 18.566f, 14.529f)
                curveTo(18.305f, 14.235f, 17.915f, 14.0f, 17.45f, 14.0f)
                horizontalLineTo(12.55f)
                close()
            }
        }
        .build()
        return _windowInPrivateAccount!!
    }

@Suppress("ObjectPropertyName")
private var _windowInPrivateAccount: ImageVector? = null

@Preview
@Composable
private fun WindowInPrivateAccountPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.WindowInPrivateAccount, contentDescription = "WindowInPrivateAccount Icon")
    }
}

