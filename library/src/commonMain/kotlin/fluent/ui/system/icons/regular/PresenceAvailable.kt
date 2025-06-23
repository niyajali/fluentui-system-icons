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

public val FluentIcons.Regular.PresenceAvailable: ImageVector
    get() {
        if (_PresenceAvailable != null) {
            return _PresenceAvailable!!
        }
        _PresenceAvailable = ImageVector.Builder(
            name = "Regular.PresenceAvailable",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12f, 0f)
                curveTo(5.373f, 0f, 0f, 5.373f, 0f, 12f)
                curveTo(0f, 18.627f, 5.373f, 24f, 12f, 24f)
                curveTo(18.627f, 24f, 24f, 18.627f, 24f, 12f)
                curveTo(24f, 5.373f, 18.627f, 0f, 12f, 0f)
                close()
                moveTo(3f, 12f)
                curveTo(3f, 7.029f, 7.029f, 3f, 12f, 3f)
                curveTo(16.971f, 3f, 21f, 7.029f, 21f, 12f)
                curveTo(21f, 16.971f, 16.971f, 21f, 12f, 21f)
                curveTo(7.029f, 21f, 3f, 16.971f, 3f, 12f)
                close()
                moveTo(17.061f, 8.439f)
                curveTo(17.646f, 9.025f, 17.646f, 9.975f, 17.061f, 10.561f)
                lineTo(11.561f, 16.061f)
                curveTo(10.975f, 16.646f, 10.025f, 16.646f, 9.439f, 16.061f)
                lineTo(7.439f, 14.061f)
                curveTo(6.854f, 13.475f, 6.854f, 12.525f, 7.439f, 11.939f)
                curveTo(8.025f, 11.354f, 8.975f, 11.354f, 9.561f, 11.939f)
                lineTo(10.5f, 12.879f)
                lineTo(14.939f, 8.439f)
                curveTo(15.525f, 7.854f, 16.475f, 7.854f, 17.061f, 8.439f)
                close()
            }
        }.build()

        return _PresenceAvailable!!
    }

@Suppress("ObjectPropertyName")
private var _PresenceAvailable: ImageVector? = null

@Preview
@Composable
private fun PresenceAvailablePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.PresenceAvailable, contentDescription = null)
    }
}
