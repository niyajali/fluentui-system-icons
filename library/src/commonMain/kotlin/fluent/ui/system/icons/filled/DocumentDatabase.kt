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

public val FluentIcons.Filled.DocumentDatabase: ImageVector
    get() {
        if (_DocumentDatabase != null) {
            return _DocumentDatabase!!
        }
        _DocumentDatabase = ImageVector.Builder(
            name = "Filled.DocumentDatabase",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12f, 2f)
                verticalLineTo(8f)
                curveTo(12f, 9.105f, 12.895f, 10f, 14f, 10f)
                horizontalLineTo(20f)
                verticalLineTo(20f)
                curveTo(20f, 21.105f, 19.105f, 22f, 18f, 22f)
                horizontalLineTo(11.467f)
                curveTo(11.791f, 21.58f, 12f, 21.081f, 12f, 20.5f)
                verticalLineTo(14.293f)
                lineTo(11.991f, 14.3f)
                curveTo(11.934f, 13.636f, 11.592f, 13.077f, 11.155f, 12.65f)
                curveTo(10.679f, 12.184f, 10.046f, 11.824f, 9.352f, 11.564f)
                curveTo(8.834f, 11.369f, 8.261f, 11.222f, 7.655f, 11.127f)
                curveTo(7.129f, 11.044f, 6.573f, 11f, 6f, 11f)
                curveTo(5.305f, 11f, 4.631f, 11.065f, 4f, 11.187f)
                verticalLineTo(4f)
                curveTo(4f, 2.895f, 4.895f, 2f, 6f, 2f)
                horizontalLineTo(12f)
                close()
                moveTo(11f, 20.5f)
                curveTo(11f, 21.063f, 10.628f, 21.582f, 10f, 22f)
                curveTo(9.088f, 22.607f, 7.636f, 23f, 6f, 23f)
                curveTo(3.95f, 23f, 2.188f, 22.383f, 1.416f, 21.5f)
                curveTo(1.148f, 21.194f, 1f, 20.856f, 1f, 20.5f)
                verticalLineTo(16.492f)
                curveTo(1.31f, 16.762f, 1.663f, 16.985f, 2.017f, 17.162f)
                curveTo(2.593f, 17.45f, 3.267f, 17.671f, 4f, 17.813f)
                curveTo(4.631f, 17.935f, 5.305f, 18f, 6f, 18f)
                curveTo(6.072f, 18f, 6.143f, 17.999f, 6.214f, 17.998f)
                curveTo(6.654f, 17.99f, 7.085f, 17.955f, 7.5f, 17.896f)
                curveTo(7.515f, 17.895f, 7.529f, 17.892f, 7.544f, 17.89f)
                curveTo(7.581f, 17.885f, 7.618f, 17.879f, 7.655f, 17.873f)
                curveTo(7.785f, 17.853f, 7.913f, 17.83f, 8.04f, 17.805f)
                curveTo(8.098f, 17.794f, 8.156f, 17.781f, 8.213f, 17.769f)
                curveTo(8.485f, 17.71f, 8.748f, 17.639f, 9f, 17.559f)
                curveTo(9.351f, 17.446f, 9.68f, 17.313f, 9.983f, 17.162f)
                lineTo(10f, 17.153f)
                lineTo(10.018f, 17.144f)
                curveTo(10.36f, 16.97f, 10.701f, 16.753f, 11f, 16.492f)
                verticalLineTo(20.5f)
                close()
                moveTo(6f, 17f)
                curveTo(5.289f, 17f, 4.612f, 16.926f, 4f, 16.792f)
                curveTo(2.234f, 16.406f, 1f, 15.525f, 1f, 14.5f)
                curveTo(1f, 13.475f, 2.234f, 12.594f, 4f, 12.208f)
                curveTo(4.612f, 12.074f, 5.289f, 12f, 6f, 12f)
                curveTo(6.523f, 12f, 7.026f, 12.04f, 7.5f, 12.114f)
                curveTo(8.046f, 12.2f, 8.552f, 12.332f, 9f, 12.5f)
                curveTo(10.214f, 12.956f, 11f, 13.682f, 11f, 14.5f)
                curveTo(11f, 14.928f, 10.785f, 15.33f, 10.406f, 15.682f)
                curveTo(10.403f, 15.686f, 10.4f, 15.689f, 10.397f, 15.691f)
                curveTo(10.379f, 15.708f, 10.362f, 15.723f, 10.344f, 15.739f)
                curveTo(10.122f, 15.933f, 9.849f, 16.111f, 9.536f, 16.268f)
                curveTo(9.425f, 16.323f, 9.309f, 16.376f, 9.188f, 16.426f)
                curveTo(9.127f, 16.451f, 9.064f, 16.476f, 9f, 16.5f)
                curveTo(8.673f, 16.623f, 8.315f, 16.726f, 7.933f, 16.806f)
                curveTo(7.792f, 16.836f, 7.647f, 16.862f, 7.5f, 16.885f)
                curveTo(7.46f, 16.892f, 7.42f, 16.898f, 7.38f, 16.904f)
                curveTo(7.374f, 16.904f, 7.367f, 16.905f, 7.36f, 16.906f)
                curveTo(6.992f, 16.958f, 6.606f, 16.99f, 6.209f, 16.998f)
                curveTo(6.139f, 16.999f, 6.07f, 17f, 6f, 17f)
                close()
                moveTo(13.5f, 2.5f)
                verticalLineTo(8f)
                curveTo(13.5f, 8.276f, 13.724f, 8.5f, 14f, 8.5f)
                horizontalLineTo(19.5f)
                lineTo(13.5f, 2.5f)
                close()
            }
        }.build()

        return _DocumentDatabase!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentDatabase: ImageVector? = null

@Preview
@Composable
private fun DocumentDatabasePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.DocumentDatabase, contentDescription = null)
    }
}
