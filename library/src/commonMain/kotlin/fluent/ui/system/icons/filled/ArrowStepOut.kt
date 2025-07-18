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

public val FluentIcons.Filled.ArrowStepOut: ImageVector
    get() {
        if (_ArrowStepOut != null) {
            return _ArrowStepOut!!
        }
        _ArrowStepOut = ImageVector.Builder(
            name = "Filled.ArrowStepOut",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12.75f, 13.75f)
                curveTo(12.75f, 14.164f, 12.414f, 14.5f, 12f, 14.5f)
                curveTo(11.586f, 14.5f, 11.25f, 14.164f, 11.25f, 13.75f)
                verticalLineTo(4.494f)
                lineTo(7.766f, 7.794f)
                curveTo(7.465f, 8.079f, 6.99f, 8.067f, 6.706f, 7.766f)
                curveTo(6.421f, 7.465f, 6.433f, 6.99f, 6.734f, 6.706f)
                lineTo(11.484f, 2.206f)
                curveTo(11.774f, 1.931f, 12.226f, 1.931f, 12.516f, 2.206f)
                lineTo(17.266f, 6.706f)
                curveTo(17.566f, 6.99f, 17.579f, 7.465f, 17.295f, 7.766f)
                curveTo(17.01f, 8.067f, 16.535f, 8.079f, 16.234f, 7.794f)
                lineTo(12.75f, 4.494f)
                verticalLineTo(13.75f)
                close()
                moveTo(15f, 19f)
                curveTo(15f, 20.657f, 13.657f, 22f, 12f, 22f)
                curveTo(10.343f, 22f, 9f, 20.657f, 9f, 19f)
                curveTo(9f, 17.343f, 10.343f, 16f, 12f, 16f)
                curveTo(13.657f, 16f, 15f, 17.343f, 15f, 19f)
                close()
            }
        }.build()

        return _ArrowStepOut!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowStepOut: ImageVector? = null

@Preview
@Composable
private fun ArrowStepOutPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ArrowStepOut, contentDescription = null)
    }
}
