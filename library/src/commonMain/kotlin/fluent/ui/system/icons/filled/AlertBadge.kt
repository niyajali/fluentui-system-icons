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

public val FluentIcons.Filled.AlertBadge: ImageVector
    get() {
        if (_AlertBadge != null) {
            return _AlertBadge!!
        }
        _AlertBadge = ImageVector.Builder(
            name = "Filled.AlertBadge",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(18.5f, 9f)
                curveTo(18.838f, 9f, 19.164f, 8.952f, 19.473f, 8.863f)
                curveTo(19.491f, 9.074f, 19.5f, 9.288f, 19.5f, 9.504f)
                verticalLineTo(13.502f)
                lineTo(20.918f, 16.663f)
                curveTo(20.973f, 16.785f, 21.002f, 16.917f, 21.002f, 17.052f)
                curveTo(21.002f, 17.576f, 20.576f, 18.001f, 20.052f, 18.001f)
                horizontalLineTo(3.952f)
                curveTo(3.818f, 18.001f, 3.686f, 17.973f, 3.564f, 17.919f)
                curveTo(3.085f, 17.704f, 2.871f, 17.142f, 3.085f, 16.663f)
                lineTo(4.5f, 13.503f)
                lineTo(4.5f, 9.491f)
                lineTo(4.505f, 9.241f)
                curveTo(4.644f, 5.21f, 7.956f, 2.004f, 12f, 2.004f)
                curveTo(13.443f, 2.004f, 14.792f, 2.412f, 15.936f, 3.118f)
                curveTo(15.355f, 3.743f, 15f, 4.58f, 15f, 5.5f)
                curveTo(15f, 7.433f, 16.567f, 9f, 18.5f, 9f)
                close()
                moveTo(14.958f, 19.003f)
                curveTo(14.72f, 20.421f, 13.486f, 21.501f, 12f, 21.501f)
                curveTo(10.514f, 21.501f, 9.28f, 20.421f, 9.042f, 19.003f)
                horizontalLineTo(14.958f)
                close()
                moveTo(18.5f, 8f)
                curveTo(19.881f, 8f, 21f, 6.881f, 21f, 5.5f)
                curveTo(21f, 4.119f, 19.881f, 3f, 18.5f, 3f)
                curveTo(17.119f, 3f, 16f, 4.119f, 16f, 5.5f)
                curveTo(16f, 6.881f, 17.119f, 8f, 18.5f, 8f)
                close()
            }
        }.build()

        return _AlertBadge!!
    }

@Suppress("ObjectPropertyName")
private var _AlertBadge: ImageVector? = null

@Preview
@Composable
private fun AlertBadgePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.AlertBadge, contentDescription = null)
    }
}
