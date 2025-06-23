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

public val FluentIcons.Regular.ArrowStepIn: ImageVector
    get() {
        if (_ArrowStepIn != null) {
            return _ArrowStepIn!!
        }
        _ArrowStepIn = ImageVector.Builder(
            name = "Regular.ArrowStepIn",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12f, 2f)
                curveTo(12.414f, 2f, 12.75f, 2.336f, 12.75f, 2.75f)
                verticalLineTo(12.006f)
                lineTo(16.234f, 8.706f)
                curveTo(16.535f, 8.421f, 17.01f, 8.433f, 17.295f, 8.734f)
                curveTo(17.579f, 9.035f, 17.566f, 9.51f, 17.266f, 9.794f)
                lineTo(12.516f, 14.295f)
                curveTo(12.226f, 14.568f, 11.774f, 14.568f, 11.484f, 14.295f)
                lineTo(6.734f, 9.794f)
                curveTo(6.433f, 9.51f, 6.421f, 9.035f, 6.706f, 8.734f)
                curveTo(6.99f, 8.433f, 7.465f, 8.421f, 7.766f, 8.706f)
                lineTo(11.25f, 12.006f)
                verticalLineTo(2.75f)
                curveTo(11.25f, 2.336f, 11.586f, 2f, 12f, 2f)
                close()
                moveTo(12f, 22f)
                curveTo(13.657f, 22f, 15f, 20.657f, 15f, 19f)
                curveTo(15f, 17.343f, 13.657f, 16f, 12f, 16f)
                curveTo(10.343f, 16f, 9f, 17.343f, 9f, 19f)
                curveTo(9f, 20.657f, 10.343f, 22f, 12f, 22f)
                close()
                moveTo(12f, 20.5f)
                curveTo(11.172f, 20.5f, 10.5f, 19.828f, 10.5f, 19f)
                curveTo(10.5f, 18.172f, 11.172f, 17.5f, 12f, 17.5f)
                curveTo(12.828f, 17.5f, 13.5f, 18.172f, 13.5f, 19f)
                curveTo(13.5f, 19.828f, 12.828f, 20.5f, 12f, 20.5f)
                close()
            }
        }.build()

        return _ArrowStepIn!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowStepIn: ImageVector? = null

@Preview
@Composable
private fun ArrowStepInPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ArrowStepIn, contentDescription = null)
    }
}
