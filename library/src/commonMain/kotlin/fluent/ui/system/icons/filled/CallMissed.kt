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

public val FluentIcons.Filled.CallMissed: ImageVector
    get() {
        if (_CallMissed != null) {
            return _CallMissed!!
        }
        _CallMissed = ImageVector.Builder(
            name = "Filled.CallMissed",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(20.934f, 5.66f)
                curveTo(18.974f, 3.93f, 15.913f, 3.067f, 11.749f, 3.072f)
                curveTo(7.592f, 3.078f, 4.623f, 3.946f, 2.842f, 5.676f)
                curveTo(2.088f, 6.409f, 1.813f, 7.495f, 2.121f, 8.526f)
                lineTo(2.43f, 9.563f)
                curveTo(2.719f, 10.53f, 3.692f, 11.176f, 4.707f, 11.074f)
                lineTo(6.742f, 10.87f)
                curveTo(7.615f, 10.782f, 8.305f, 10.158f, 8.453f, 9.323f)
                lineTo(8.844f, 7.118f)
                curveTo(9.812f, 6.679f, 10.859f, 6.443f, 11.984f, 6.411f)
                curveTo(13.11f, 6.378f, 14.14f, 6.553f, 15.074f, 6.936f)
                lineTo(15.706f, 9.291f)
                curveTo(15.932f, 10.138f, 16.692f, 10.771f, 17.584f, 10.857f)
                lineTo(19.631f, 11.055f)
                curveTo(20.659f, 11.154f, 21.566f, 10.502f, 21.751f, 9.531f)
                lineTo(21.949f, 8.494f)
                curveTo(22.144f, 7.466f, 21.758f, 6.388f, 20.934f, 5.66f)
                close()
                moveTo(11.75f, 14f)
                curveTo(12.164f, 14f, 12.5f, 14.336f, 12.5f, 14.75f)
                verticalLineTo(16.5f)
                horizontalLineTo(13.5f)
                curveTo(13.914f, 16.5f, 14.25f, 16.836f, 14.25f, 17.25f)
                curveTo(14.25f, 17.665f, 13.914f, 18f, 13.5f, 18f)
                horizontalLineTo(11.75f)
                curveTo(11.336f, 18f, 11f, 17.665f, 11f, 17.25f)
                verticalLineTo(14.75f)
                curveTo(11f, 14.336f, 11.335f, 14f, 11.75f, 14f)
                close()
                moveTo(12f, 11f)
                curveTo(8.962f, 11f, 6.5f, 13.463f, 6.5f, 16.5f)
                curveTo(6.5f, 19.538f, 8.962f, 22f, 12f, 22f)
                curveTo(15.037f, 22f, 17.5f, 19.538f, 17.5f, 16.5f)
                curveTo(17.5f, 13.463f, 15.037f, 11f, 12f, 11f)
                close()
                moveTo(8f, 16.5f)
                curveTo(8f, 14.291f, 9.791f, 12.5f, 12f, 12.5f)
                curveTo(14.209f, 12.5f, 16f, 14.291f, 16f, 16.5f)
                curveTo(16f, 18.709f, 14.209f, 20.5f, 12f, 20.5f)
                curveTo(9.791f, 20.5f, 8f, 18.709f, 8f, 16.5f)
                close()
            }
        }.build()

        return _CallMissed!!
    }

@Suppress("ObjectPropertyName")
private var _CallMissed: ImageVector? = null

@Preview
@Composable
private fun CallMissedPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.CallMissed, contentDescription = null)
    }
}
