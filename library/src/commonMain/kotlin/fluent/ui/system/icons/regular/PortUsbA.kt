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

public val FluentIcons.Regular.PortUsbA: ImageVector
    get() {
        if (_PortUsbA != null) {
            return _PortUsbA!!
        }
        _PortUsbA = ImageVector.Builder(
            name = "Regular.PortUsbA",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(18f, 8f)
                horizontalLineTo(6f)
                curveTo(5.47f, 8.002f, 4.962f, 8.213f, 4.588f, 8.587f)
                curveTo(4.213f, 8.962f, 4.002f, 9.47f, 4f, 10f)
                verticalLineTo(14f)
                curveTo(4.002f, 14.53f, 4.213f, 15.038f, 4.588f, 15.413f)
                curveTo(4.962f, 15.787f, 5.47f, 15.998f, 6f, 16f)
                horizontalLineTo(18f)
                curveTo(18.53f, 15.998f, 19.038f, 15.787f, 19.413f, 15.413f)
                curveTo(19.787f, 15.038f, 19.998f, 14.53f, 20f, 14f)
                verticalLineTo(10f)
                curveTo(19.999f, 9.47f, 19.787f, 8.962f, 19.413f, 8.587f)
                curveTo(19.038f, 8.213f, 18.53f, 8.002f, 18f, 8f)
                verticalLineTo(8f)
                close()
                moveTo(5.5f, 10f)
                curveTo(5.499f, 9.934f, 5.512f, 9.869f, 5.537f, 9.808f)
                curveTo(5.562f, 9.747f, 5.598f, 9.692f, 5.645f, 9.645f)
                curveTo(5.692f, 9.598f, 5.747f, 9.562f, 5.808f, 9.537f)
                curveTo(5.869f, 9.512f, 5.934f, 9.499f, 6f, 9.5f)
                horizontalLineTo(18f)
                curveTo(18.066f, 9.499f, 18.131f, 9.512f, 18.192f, 9.537f)
                curveTo(18.253f, 9.562f, 18.308f, 9.598f, 18.355f, 9.645f)
                curveTo(18.402f, 9.692f, 18.438f, 9.747f, 18.463f, 9.808f)
                curveTo(18.488f, 9.869f, 18.501f, 9.934f, 18.5f, 10f)
                verticalLineTo(12f)
                horizontalLineTo(5.5f)
                verticalLineTo(10f)
                close()
            }
        }.build()

        return _PortUsbA!!
    }

@Suppress("ObjectPropertyName")
private var _PortUsbA: ImageVector? = null

@Preview
@Composable
private fun PortUsbAPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.PortUsbA, contentDescription = null)
    }
}
