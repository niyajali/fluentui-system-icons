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

public val FluentIcons.Filled.WindowDatabase: ImageVector
    get() {
        if (_WindowDatabase != null) {
            return _WindowDatabase!!
        }
        _WindowDatabase = ImageVector.Builder(
            name = "Filled.WindowDatabase",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3f, 6.25f)
                curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
                horizontalLineTo(17.75f)
                curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
                verticalLineTo(10.826f)
                curveTo(20.529f, 10.715f, 20.024f, 10.631f, 19.5f, 10.576f)
                verticalLineTo(8.5f)
                horizontalLineTo(4.5f)
                verticalLineTo(17.75f)
                curveTo(4.5f, 18.716f, 5.284f, 19.5f, 6.25f, 19.5f)
                horizontalLineTo(11.5f)
                verticalLineTo(21f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
                verticalLineTo(6.25f)
                close()
                moveTo(14.664f, 12.481f)
                curveTo(15.551f, 12.177f, 16.732f, 12f, 18f, 12f)
                curveTo(19.268f, 12f, 20.449f, 12.177f, 21.336f, 12.481f)
                curveTo(21.778f, 12.633f, 22.177f, 12.826f, 22.474f, 13.066f)
                curveTo(22.773f, 13.307f, 23f, 13.623f, 23f, 14f)
                curveTo(23f, 14.377f, 22.773f, 14.693f, 22.474f, 14.934f)
                curveTo(22.177f, 15.174f, 21.778f, 15.367f, 21.336f, 15.519f)
                curveTo(20.449f, 15.823f, 19.268f, 16f, 18f, 16f)
                curveTo(16.732f, 16f, 15.551f, 15.823f, 14.664f, 15.519f)
                curveTo(14.222f, 15.367f, 13.823f, 15.174f, 13.526f, 14.934f)
                curveTo(13.227f, 14.693f, 13f, 14.377f, 13f, 14f)
                curveTo(13f, 13.623f, 13.227f, 13.307f, 13.526f, 13.066f)
                curveTo(13.823f, 12.826f, 14.222f, 12.633f, 14.664f, 12.481f)
                close()
                moveTo(13f, 21f)
                verticalLineTo(16.395f)
                curveTo(13.381f, 16.631f, 13.791f, 16.806f, 14.177f, 16.938f)
                curveTo(15.258f, 17.309f, 16.611f, 17.5f, 18f, 17.5f)
                curveTo(19.389f, 17.5f, 20.742f, 17.309f, 21.823f, 16.938f)
                curveTo(22.209f, 16.806f, 22.619f, 16.631f, 23f, 16.395f)
                verticalLineTo(21f)
                curveTo(23f, 21.427f, 22.738f, 21.753f, 22.454f, 21.976f)
                curveTo(22.163f, 22.204f, 21.773f, 22.388f, 21.336f, 22.534f)
                curveTo(20.458f, 22.827f, 19.277f, 23f, 18f, 23f)
                curveTo(16.723f, 23f, 15.542f, 22.827f, 14.664f, 22.534f)
                curveTo(14.227f, 22.388f, 13.837f, 22.204f, 13.546f, 21.976f)
                curveTo(13.262f, 21.753f, 13f, 21.427f, 13f, 21f)
                close()
            }
        }.build()

        return _WindowDatabase!!
    }

@Suppress("ObjectPropertyName")
private var _WindowDatabase: ImageVector? = null

@Preview
@Composable
private fun WindowDatabasePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.WindowDatabase, contentDescription = null)
    }
}
