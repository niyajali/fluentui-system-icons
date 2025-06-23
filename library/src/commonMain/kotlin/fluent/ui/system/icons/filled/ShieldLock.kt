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

public val FluentIcons.Filled.ShieldLock: ImageVector
    get() {
        if (_ShieldLock != null) {
            return _ShieldLock!!
        }
        _ShieldLock = ImageVector.Builder(
            name = "Filled.ShieldLock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3f, 5.75f)
                curveTo(3f, 5.336f, 3.336f, 5f, 3.75f, 5f)
                curveTo(6.413f, 5f, 9.008f, 4.057f, 11.55f, 2.15f)
                curveTo(11.817f, 1.95f, 12.183f, 1.95f, 12.45f, 2.15f)
                curveTo(14.992f, 4.057f, 17.587f, 5f, 20.25f, 5f)
                curveTo(20.664f, 5f, 21f, 5.336f, 21f, 5.75f)
                verticalLineTo(11f)
                curveTo(21f, 11.181f, 20.996f, 11.361f, 20.988f, 11.539f)
                curveTo(20.354f, 10.897f, 19.473f, 10.5f, 18.5f, 10.5f)
                curveTo(16.567f, 10.5f, 15f, 12.067f, 15f, 14f)
                verticalLineTo(14.05f)
                curveTo(13.859f, 14.282f, 13f, 15.29f, 13f, 16.5f)
                verticalLineTo(21.5f)
                curveTo(13f, 21.549f, 13.001f, 21.598f, 13.004f, 21.646f)
                curveTo(12.766f, 21.75f, 12.523f, 21.85f, 12.275f, 21.948f)
                curveTo(12.098f, 22.017f, 11.902f, 22.017f, 11.725f, 21.948f)
                curveTo(5.958f, 19.676f, 3f, 16.001f, 3f, 11f)
                verticalLineTo(5.75f)
                close()
                moveTo(16f, 15f)
                verticalLineTo(14f)
                curveTo(16f, 12.619f, 17.119f, 11.5f, 18.5f, 11.5f)
                curveTo(19.881f, 11.5f, 21f, 12.619f, 21f, 14f)
                verticalLineTo(15f)
                horizontalLineTo(21.5f)
                curveTo(22.328f, 15f, 23f, 15.672f, 23f, 16.5f)
                verticalLineTo(21.5f)
                curveTo(23f, 22.328f, 22.328f, 23f, 21.5f, 23f)
                horizontalLineTo(15.5f)
                curveTo(14.672f, 23f, 14f, 22.328f, 14f, 21.5f)
                verticalLineTo(16.5f)
                curveTo(14f, 15.672f, 14.672f, 15f, 15.5f, 15f)
                horizontalLineTo(16f)
                close()
                moveTo(17.5f, 14f)
                verticalLineTo(15f)
                horizontalLineTo(19.5f)
                verticalLineTo(14f)
                curveTo(19.5f, 13.448f, 19.052f, 13f, 18.5f, 13f)
                curveTo(17.948f, 13f, 17.5f, 13.448f, 17.5f, 14f)
                close()
                moveTo(19.5f, 19f)
                curveTo(19.5f, 18.448f, 19.052f, 18f, 18.5f, 18f)
                curveTo(17.948f, 18f, 17.5f, 18.448f, 17.5f, 19f)
                curveTo(17.5f, 19.552f, 17.948f, 20f, 18.5f, 20f)
                curveTo(19.052f, 20f, 19.5f, 19.552f, 19.5f, 19f)
                close()
            }
        }.build()

        return _ShieldLock!!
    }

@Suppress("ObjectPropertyName")
private var _ShieldLock: ImageVector? = null

@Preview
@Composable
private fun ShieldLockPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ShieldLock, contentDescription = null)
    }
}
