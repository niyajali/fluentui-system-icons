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

public val FluentIcons.Regular.PhoneLock: ImageVector
    get() {
        if (_PhoneLock != null) {
            return _PhoneLock!!
        }
        _PhoneLock = ImageVector.Builder(
            name = "Regular.PhoneLock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(13.75f, 2f)
                curveTo(14.993f, 2f, 16f, 3.007f, 16f, 4.25f)
                verticalLineTo(10.837f)
                curveTo(15.376f, 11.133f, 14.854f, 11.608f, 14.5f, 12.196f)
                verticalLineTo(4.25f)
                curveTo(14.5f, 3.836f, 14.164f, 3.5f, 13.75f, 3.5f)
                horizontalLineTo(6.25f)
                curveTo(5.836f, 3.5f, 5.5f, 3.836f, 5.5f, 4.25f)
                verticalLineTo(19.75f)
                curveTo(5.5f, 20.164f, 5.836f, 20.5f, 6.25f, 20.5f)
                horizontalLineTo(12f)
                verticalLineTo(21.5f)
                curveTo(12f, 21.671f, 12.017f, 21.838f, 12.05f, 22f)
                horizontalLineTo(6.25f)
                curveTo(5.007f, 22f, 4f, 20.993f, 4f, 19.75f)
                verticalLineTo(4.25f)
                curveTo(4f, 3.007f, 5.007f, 2f, 6.25f, 2f)
                horizontalLineTo(13.75f)
                close()
                moveTo(15f, 14f)
                curveTo(15f, 13.182f, 15.393f, 12.456f, 16f, 12f)
                curveTo(16.418f, 11.686f, 16.937f, 11.5f, 17.5f, 11.5f)
                curveTo(18.881f, 11.5f, 20f, 12.619f, 20f, 14f)
                verticalLineTo(15f)
                horizontalLineTo(20.5f)
                curveTo(21.328f, 15f, 22f, 15.672f, 22f, 16.5f)
                verticalLineTo(21.5f)
                curveTo(22f, 22.328f, 21.328f, 23f, 20.5f, 23f)
                horizontalLineTo(14.5f)
                curveTo(13.847f, 23f, 13.291f, 22.583f, 13.085f, 22f)
                curveTo(13.03f, 21.844f, 13f, 21.675f, 13f, 21.5f)
                verticalLineTo(16.5f)
                curveTo(13f, 15.672f, 13.672f, 15f, 14.5f, 15f)
                horizontalLineTo(15f)
                verticalLineTo(14f)
                close()
                moveTo(16.5f, 14f)
                verticalLineTo(15f)
                horizontalLineTo(18.5f)
                verticalLineTo(14f)
                curveTo(18.5f, 13.448f, 18.052f, 13f, 17.5f, 13f)
                curveTo(16.948f, 13f, 16.5f, 13.448f, 16.5f, 14f)
                close()
                moveTo(18.5f, 19f)
                curveTo(18.5f, 18.448f, 18.052f, 18f, 17.5f, 18f)
                curveTo(16.948f, 18f, 16.5f, 18.448f, 16.5f, 19f)
                curveTo(16.5f, 19.552f, 16.948f, 20f, 17.5f, 20f)
                curveTo(18.052f, 20f, 18.5f, 19.552f, 18.5f, 19f)
                close()
                moveTo(12f, 18.249f)
                lineTo(12f, 18.25f)
                curveTo(12f, 18.664f, 11.665f, 18.999f, 11.251f, 19f)
                lineTo(8.751f, 19.004f)
                curveTo(8.337f, 19.004f, 8.001f, 18.669f, 8f, 18.255f)
                curveTo(7.999f, 17.841f, 8.335f, 17.504f, 8.749f, 17.504f)
                lineTo(11.249f, 17.5f)
                curveTo(11.663f, 17.499f, 11.999f, 17.835f, 12f, 18.249f)
                close()
            }
        }.build()

        return _PhoneLock!!
    }

@Suppress("ObjectPropertyName")
private var _PhoneLock: ImageVector? = null

@Preview
@Composable
private fun PhoneLockPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.PhoneLock, contentDescription = null)
    }
}
