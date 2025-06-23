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

public val FluentIcons.Regular.GlobeSync: ImageVector
    get() {
        if (_GlobeSync != null) {
            return _GlobeSync!!
        }
        _GlobeSync = ImageVector.Builder(
            name = "Regular.GlobeSync",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12.002f, 1.999f)
                curveTo(17.525f, 1.999f, 22.003f, 6.477f, 22.003f, 12.001f)
                curveTo(22.003f, 12.264f, 21.993f, 12.525f, 21.973f, 12.784f)
                curveTo(21.535f, 12.368f, 21.039f, 12.013f, 20.499f, 11.732f)
                curveTo(20.48f, 11.137f, 20.401f, 10.557f, 20.266f, 9.999f)
                lineTo(16.908f, 10f)
                curveTo(16.94f, 10.335f, 16.965f, 10.675f, 16.981f, 11.02f)
                curveTo(16.465f, 11.061f, 15.966f, 11.162f, 15.491f, 11.316f)
                curveTo(15.475f, 10.866f, 15.444f, 10.427f, 15.399f, 10f)
                horizontalLineTo(8.605f)
                curveTo(8.537f, 10.64f, 8.5f, 11.31f, 8.5f, 12.001f)
                curveTo(8.5f, 13.06f, 8.586f, 14.07f, 8.74f, 15.001f)
                horizontalLineTo(11.498f)
                curveTo(11.3f, 15.475f, 11.157f, 15.977f, 11.076f, 16.5f)
                horizontalLineTo(9.063f)
                curveTo(9.661f, 18.715f, 10.664f, 20.235f, 11.717f, 20.47f)
                curveTo(12f, 21.021f, 12.36f, 21.527f, 12.783f, 21.972f)
                curveTo(12.525f, 21.992f, 12.264f, 22.002f, 12.002f, 22.002f)
                curveTo(6.478f, 22.002f, 2f, 17.524f, 2f, 12.001f)
                curveTo(2f, 6.477f, 6.478f, 1.999f, 12.002f, 1.999f)
                close()
                moveTo(7.51f, 16.501f)
                lineTo(4.787f, 16.501f)
                curveTo(5.746f, 18.034f, 7.179f, 19.239f, 8.882f, 19.911f)
                curveTo(8.359f, 19.091f, 7.928f, 18.065f, 7.611f, 16.896f)
                lineTo(7.51f, 16.501f)
                close()
                moveTo(7.095f, 10f)
                horizontalLineTo(3.737f)
                lineTo(3.733f, 10.017f)
                curveTo(3.581f, 10.653f, 3.5f, 11.318f, 3.5f, 12.001f)
                curveTo(3.5f, 13.057f, 3.693f, 14.068f, 4.045f, 15.001f)
                lineTo(7.218f, 15f)
                curveTo(7.075f, 14.051f, 7f, 13.043f, 7f, 12.001f)
                curveTo(7f, 11.317f, 7.032f, 10.647f, 7.095f, 10f)
                close()
                moveTo(8.883f, 4.09f)
                lineTo(8.86f, 4.098f)
                curveTo(6.812f, 4.913f, 5.156f, 6.5f, 4.252f, 8.5f)
                lineTo(7.3f, 8.501f)
                curveTo(7.613f, 6.748f, 8.16f, 5.222f, 8.883f, 4.09f)
                close()
                moveTo(12.002f, 3.499f)
                lineTo(11.886f, 3.504f)
                curveTo(10.62f, 3.62f, 9.398f, 5.622f, 8.83f, 8.5f)
                horizontalLineTo(15.173f)
                curveTo(14.607f, 5.63f, 13.389f, 3.631f, 12.128f, 3.505f)
                lineTo(12.002f, 3.499f)
                close()
                moveTo(15.122f, 4.09f)
                lineTo(15.228f, 4.264f)
                curveTo(15.898f, 5.376f, 16.406f, 6.836f, 16.703f, 8.501f)
                lineTo(19.751f, 8.5f)
                curveTo(18.887f, 6.589f, 17.336f, 5.054f, 15.413f, 4.211f)
                lineTo(15.122f, 4.09f)
                close()
                moveTo(12f, 17.5f)
                curveTo(12f, 20.538f, 14.462f, 23f, 17.5f, 23f)
                curveTo(20.538f, 23f, 23f, 20.538f, 23f, 17.5f)
                curveTo(23f, 14.462f, 20.538f, 12f, 17.5f, 12f)
                curveTo(14.462f, 12f, 12f, 14.462f, 12f, 17.5f)
                close()
                moveTo(20.5f, 14f)
                curveTo(20.776f, 14f, 21f, 14.224f, 21f, 14.5f)
                verticalLineTo(16.5f)
                curveTo(21f, 16.776f, 20.776f, 17f, 20.5f, 17f)
                horizontalLineTo(18.5f)
                curveTo(18.224f, 17f, 18f, 16.776f, 18f, 16.5f)
                curveTo(18f, 16.224f, 18.224f, 16f, 18.5f, 16f)
                horizontalLineTo(19.5f)
                curveTo(19.044f, 15.392f, 18.317f, 15f, 17.5f, 15f)
                curveTo(16.667f, 15f, 15.928f, 15.407f, 15.473f, 16.036f)
                curveTo(15.311f, 16.26f, 14.999f, 16.31f, 14.775f, 16.148f)
                curveTo(14.551f, 15.986f, 14.501f, 15.673f, 14.663f, 15.45f)
                curveTo(15.298f, 14.572f, 16.332f, 14f, 17.5f, 14f)
                curveTo(18.48f, 14f, 19.365f, 14.403f, 20f, 15.051f)
                verticalLineTo(14.5f)
                curveTo(20f, 14.224f, 20.224f, 14f, 20.5f, 14f)
                close()
                moveTo(15f, 19.949f)
                verticalLineTo(20.5f)
                curveTo(15f, 20.776f, 14.776f, 21f, 14.5f, 21f)
                curveTo(14.224f, 21f, 14f, 20.776f, 14f, 20.5f)
                verticalLineTo(18.5f)
                curveTo(14f, 18.224f, 14.224f, 18f, 14.5f, 18f)
                horizontalLineTo(16.5f)
                curveTo(16.776f, 18f, 17f, 18.224f, 17f, 18.5f)
                curveTo(17f, 18.776f, 16.776f, 19f, 16.5f, 19f)
                horizontalLineTo(15.5f)
                curveTo(15.956f, 19.608f, 16.683f, 20f, 17.5f, 20f)
                curveTo(18.266f, 20f, 18.952f, 19.656f, 19.411f, 19.112f)
                curveTo(19.589f, 18.901f, 19.905f, 18.874f, 20.116f, 19.052f)
                curveTo(20.327f, 19.23f, 20.353f, 19.546f, 20.175f, 19.757f)
                curveTo(19.534f, 20.516f, 18.573f, 21f, 17.5f, 21f)
                curveTo(16.52f, 21f, 15.635f, 20.597f, 15f, 19.949f)
                close()
            }
        }.build()

        return _GlobeSync!!
    }

@Suppress("ObjectPropertyName")
private var _GlobeSync: ImageVector? = null

@Preview
@Composable
private fun GlobeSyncPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.GlobeSync, contentDescription = null)
    }
}
