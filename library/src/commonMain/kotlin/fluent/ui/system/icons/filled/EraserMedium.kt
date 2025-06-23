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

public val FluentIcons.Filled.EraserMedium: ImageVector
    get() {
        if (_EraserMedium != null) {
            return _EraserMedium!!
        }
        _EraserMedium = ImageVector.Builder(
            name = "Filled.EraserMedium",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12.651f, 2.638f)
                curveTo(13.537f, 1.76f, 14.968f, 1.771f, 15.841f, 2.661f)
                lineTo(20.751f, 7.669f)
                curveTo(21.612f, 8.547f, 21.609f, 9.953f, 20.744f, 10.827f)
                lineTo(20.057f, 11.522f)
                curveTo(19.272f, 11.186f, 18.408f, 11f, 17.5f, 11f)
                curveTo(14.053f, 11f, 11.233f, 13.682f, 11.014f, 17.074f)
                lineTo(5.637f, 11.698f)
                lineTo(4.108f, 13.212f)
                curveTo(3.811f, 13.506f, 3.812f, 13.987f, 4.111f, 14.28f)
                lineTo(9.21f, 19.288f)
                curveTo(9.505f, 19.577f, 9.978f, 19.573f, 10.268f, 19.28f)
                lineTo(11.072f, 18.468f)
                curveTo(11.158f, 19.047f, 11.321f, 19.6f, 11.549f, 20.118f)
                lineTo(11.335f, 20.335f)
                curveTo(10.463f, 21.216f, 9.043f, 21.226f, 8.159f, 20.358f)
                lineTo(3.06f, 15.35f)
                curveTo(2.164f, 14.471f, 2.161f, 13.03f, 3.053f, 12.146f)
                lineTo(12.651f, 2.638f)
                close()
                moveTo(17.5f, 12f)
                curveTo(18.126f, 12f, 18.728f, 12.104f, 19.289f, 12.297f)
                curveTo(21.448f, 13.04f, 23f, 15.088f, 23f, 17.5f)
                curveTo(23f, 20.537f, 20.538f, 23f, 17.5f, 23f)
                curveTo(15.109f, 23f, 13.074f, 21.474f, 12.316f, 19.343f)
                curveTo(12.112f, 18.767f, 12f, 18.146f, 12f, 17.5f)
                curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
                close()
            }
        }.build()

        return _EraserMedium!!
    }

@Suppress("ObjectPropertyName")
private var _EraserMedium: ImageVector? = null

@Preview
@Composable
private fun EraserMediumPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.EraserMedium, contentDescription = null)
    }
}
