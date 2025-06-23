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

public val FluentIcons.Regular.DatabasePerson: ImageVector
    get() {
        if (_DatabasePerson != null) {
            return _DatabasePerson!!
        }
        _DatabasePerson = ImageVector.Builder(
            name = "Regular.DatabasePerson",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(4f, 6.5f)
                curveTo(4f, 5.809f, 4.315f, 5.207f, 4.774f, 4.72f)
                curveTo(5.229f, 4.238f, 5.853f, 3.837f, 6.567f, 3.518f)
                curveTo(7.996f, 2.877f, 9.917f, 2.5f, 12f, 2.5f)
                curveTo(14.083f, 2.5f, 16.004f, 2.877f, 17.433f, 3.518f)
                curveTo(18.147f, 3.837f, 18.771f, 4.238f, 19.226f, 4.72f)
                curveTo(19.685f, 5.207f, 20f, 5.809f, 20f, 6.5f)
                verticalLineTo(11.837f)
                curveTo(19.545f, 11.621f, 19.037f, 11.5f, 18.5f, 11.5f)
                verticalLineTo(8.892f)
                curveTo(18.179f, 9.113f, 17.819f, 9.309f, 17.433f, 9.482f)
                curveTo(16.004f, 10.123f, 14.083f, 10.5f, 12f, 10.5f)
                curveTo(9.917f, 10.5f, 7.996f, 10.123f, 6.567f, 9.482f)
                curveTo(6.181f, 9.309f, 5.821f, 9.113f, 5.5f, 8.892f)
                verticalLineTo(18.5f)
                curveTo(5.5f, 18.707f, 5.59f, 18.959f, 5.865f, 19.25f)
                curveTo(6.144f, 19.546f, 6.582f, 19.846f, 7.18f, 20.114f)
                curveTo(8.375f, 20.649f, 10.079f, 21f, 12f, 21f)
                curveTo(12.357f, 21f, 12.706f, 20.988f, 13.046f, 20.965f)
                curveTo(13.126f, 21.473f, 13.313f, 21.97f, 13.613f, 22.423f)
                curveTo(13.09f, 22.474f, 12.551f, 22.5f, 12f, 22.5f)
                curveTo(9.917f, 22.5f, 7.996f, 22.123f, 6.567f, 21.483f)
                curveTo(5.853f, 21.163f, 5.229f, 20.762f, 4.774f, 20.28f)
                curveTo(4.315f, 19.793f, 4f, 19.191f, 4f, 18.5f)
                verticalLineTo(6.5f)
                close()
                moveTo(5.5f, 6.5f)
                curveTo(5.5f, 6.707f, 5.59f, 6.959f, 5.865f, 7.25f)
                curveTo(6.144f, 7.546f, 6.582f, 7.845f, 7.18f, 8.114f)
                curveTo(8.375f, 8.649f, 10.079f, 9f, 12f, 9f)
                curveTo(13.921f, 9f, 15.625f, 8.649f, 16.82f, 8.114f)
                curveTo(17.418f, 7.845f, 17.856f, 7.546f, 18.135f, 7.25f)
                curveTo(18.41f, 6.959f, 18.5f, 6.707f, 18.5f, 6.5f)
                curveTo(18.5f, 6.293f, 18.41f, 6.041f, 18.135f, 5.75f)
                curveTo(17.856f, 5.454f, 17.418f, 5.154f, 16.82f, 4.886f)
                curveTo(15.625f, 4.351f, 13.921f, 4f, 12f, 4f)
                curveTo(10.079f, 4f, 8.375f, 4.351f, 7.18f, 4.886f)
                curveTo(6.582f, 5.154f, 6.144f, 5.454f, 5.865f, 5.75f)
                curveTo(5.59f, 6.041f, 5.5f, 6.293f, 5.5f, 6.5f)
                close()
                moveTo(21f, 15f)
                curveTo(21f, 16.381f, 19.881f, 17.5f, 18.5f, 17.5f)
                curveTo(17.119f, 17.5f, 16f, 16.381f, 16f, 15f)
                curveTo(16f, 13.619f, 17.119f, 12.5f, 18.5f, 12.5f)
                curveTo(19.881f, 12.5f, 21f, 13.619f, 21f, 15f)
                close()
                moveTo(23f, 20.375f)
                curveTo(23f, 21.931f, 21.714f, 23.5f, 18.5f, 23.5f)
                curveTo(15.286f, 23.5f, 14f, 21.937f, 14f, 20.375f)
                verticalLineTo(20.272f)
                curveTo(14f, 19.293f, 14.794f, 18.5f, 15.773f, 18.5f)
                horizontalLineTo(21.227f)
                curveTo(22.206f, 18.5f, 23f, 19.293f, 23f, 20.272f)
                verticalLineTo(20.375f)
                close()
            }
        }.build()

        return _DatabasePerson!!
    }

@Suppress("ObjectPropertyName")
private var _DatabasePerson: ImageVector? = null

@Preview
@Composable
private fun DatabasePersonPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.DatabasePerson, contentDescription = null)
    }
}
