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

public val FluentIcons.Filled.AlertOn: ImageVector
    get() {
        if (_AlertOn != null) {
            return _AlertOn!!
        }
        _AlertOn = ImageVector.Builder(
            name = "Filled.AlertOn",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(9.042f, 19.003f)
                horizontalLineTo(14.958f)
                curveTo(14.72f, 20.421f, 13.486f, 21.501f, 12f, 21.501f)
                curveTo(10.514f, 21.501f, 9.28f, 20.421f, 9.042f, 19.003f)
                close()
                moveTo(12f, 2.004f)
                curveTo(16.142f, 2.004f, 19.5f, 5.362f, 19.5f, 9.504f)
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
                close()
                moveTo(23f, 8.25f)
                curveTo(23.414f, 8.25f, 23.75f, 8.586f, 23.75f, 9f)
                curveTo(23.75f, 9.38f, 23.468f, 9.693f, 23.102f, 9.743f)
                lineTo(23f, 9.75f)
                horizontalLineTo(21f)
                curveTo(20.586f, 9.75f, 20.25f, 9.414f, 20.25f, 9f)
                curveTo(20.25f, 8.62f, 20.532f, 8.307f, 20.898f, 8.257f)
                lineTo(21f, 8.25f)
                horizontalLineTo(23f)
                close()
                moveTo(3f, 8.25f)
                curveTo(3.414f, 8.25f, 3.75f, 8.586f, 3.75f, 9f)
                curveTo(3.75f, 9.38f, 3.468f, 9.693f, 3.102f, 9.743f)
                lineTo(3f, 9.75f)
                horizontalLineTo(1f)
                curveTo(0.586f, 9.75f, 0.25f, 9.414f, 0.25f, 9f)
                curveTo(0.25f, 8.62f, 0.532f, 8.307f, 0.898f, 8.257f)
                lineTo(1f, 8.25f)
                horizontalLineTo(3f)
                close()
                moveTo(22.6f, 2.55f)
                curveTo(22.826f, 2.851f, 22.791f, 3.267f, 22.534f, 3.527f)
                lineTo(22.45f, 3.6f)
                lineTo(20.45f, 5.1f)
                curveTo(20.119f, 5.349f, 19.649f, 5.281f, 19.4f, 4.95f)
                curveTo(19.174f, 4.649f, 19.209f, 4.233f, 19.466f, 3.973f)
                lineTo(19.55f, 3.9f)
                lineTo(21.55f, 2.4f)
                curveTo(21.881f, 2.151f, 22.351f, 2.219f, 22.6f, 2.55f)
                close()
                moveTo(2.45f, 2.4f)
                lineTo(4.45f, 3.9f)
                curveTo(4.781f, 4.149f, 4.849f, 4.619f, 4.6f, 4.95f)
                curveTo(4.351f, 5.281f, 3.881f, 5.349f, 3.55f, 5.1f)
                lineTo(1.55f, 3.6f)
                curveTo(1.219f, 3.351f, 1.151f, 2.881f, 1.4f, 2.55f)
                curveTo(1.649f, 2.219f, 2.119f, 2.151f, 2.45f, 2.4f)
                close()
            }
        }.build()

        return _AlertOn!!
    }

@Suppress("ObjectPropertyName")
private var _AlertOn: ImageVector? = null

@Preview
@Composable
private fun AlertOnPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.AlertOn, contentDescription = null)
    }
}
