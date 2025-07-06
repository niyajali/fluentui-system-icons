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
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

/**
 * CubeRotate Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used in 3D experience scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_cube_rotate_20_regular.svg)
 * 
 * @return The [ImageVector] for the CubeRotate icon.
 */
public val FluentIcons.Regular.CubeRotate: ImageVector
    get() {
        if (_cubeRotate != null) {
            return _cubeRotate!!
        }
        _cubeRotate = Builder(name = "CubeRotate", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.952f, 3.535f)
                curveTo(9.617f, 3.228f, 10.383f, 3.228f, 11.048f, 3.535f)
                lineTo(15.71f, 5.686f)
                curveTo(15.887f, 5.768f, 16.0f, 5.945f, 16.0f, 6.14f)
                verticalLineTo(8.001f)
                horizontalLineTo(17.0f)
                verticalLineTo(6.14f)
                curveTo(17.0f, 5.555f, 16.66f, 5.024f, 16.129f, 4.778f)
                lineTo(11.467f, 2.627f)
                curveTo(10.536f, 2.197f, 9.464f, 2.197f, 8.533f, 2.627f)
                lineTo(3.871f, 4.778f)
                curveTo(3.34f, 5.024f, 3.0f, 5.555f, 3.0f, 6.14f)
                verticalLineTo(8.001f)
                horizontalLineTo(4.0f)
                lineTo(4.0f, 6.14f)
                curveTo(4.0f, 5.945f, 4.113f, 5.768f, 4.29f, 5.686f)
                lineTo(8.952f, 3.535f)
                close()
                moveTo(3.399f, 11.001f)
                curveTo(3.581f, 11.151f, 3.781f, 11.297f, 4.0f, 11.438f)
                curveTo(4.051f, 11.471f, 4.103f, 11.504f, 4.157f, 11.536f)
                curveTo(5.604f, 12.421f, 7.667f, 13.001f, 9.999f, 13.001f)
                curveTo(12.331f, 13.001f, 14.394f, 12.421f, 15.842f, 11.536f)
                curveTo(15.896f, 11.504f, 15.948f, 11.47f, 16.0f, 11.437f)
                curveTo(16.218f, 11.296f, 16.418f, 11.15f, 16.6f, 11.001f)
                curveTo(16.745f, 10.881f, 16.878f, 10.759f, 17.0f, 10.636f)
                curveTo(17.205f, 10.429f, 17.377f, 10.216f, 17.518f, 10.001f)
                horizontalLineTo(16.0f)
                curveTo(16.0f, 10.001f, 16.0f, 10.001f, 16.0f, 10.001f)
                curveTo(15.724f, 10.0f, 15.5f, 9.777f, 15.5f, 9.501f)
                curveTo(15.5f, 9.224f, 15.724f, 9.001f, 16.0f, 9.001f)
                horizontalLineTo(18.5f)
                curveTo(18.633f, 9.001f, 18.76f, 9.053f, 18.854f, 9.147f)
                curveTo(18.948f, 9.241f, 19.0f, 9.368f, 19.0f, 9.501f)
                verticalLineTo(12.001f)
                curveTo(19.0f, 12.277f, 18.776f, 12.501f, 18.5f, 12.501f)
                curveTo(18.224f, 12.501f, 18.0f, 12.277f, 18.0f, 12.001f)
                verticalLineTo(11.022f)
                curveTo(17.719f, 11.355f, 17.383f, 11.668f, 17.0f, 11.957f)
                curveTo(16.8f, 12.108f, 16.588f, 12.253f, 16.363f, 12.39f)
                curveTo(16.245f, 12.462f, 16.124f, 12.532f, 16.0f, 12.6f)
                curveTo(14.408f, 13.471f, 12.305f, 14.001f, 9.999f, 14.001f)
                curveTo(7.695f, 14.001f, 5.592f, 13.471f, 4.0f, 12.601f)
                curveTo(3.875f, 12.532f, 3.754f, 12.462f, 3.635f, 12.39f)
                curveTo(3.411f, 12.253f, 3.199f, 12.109f, 3.0f, 11.958f)
                curveTo(2.617f, 11.67f, 2.282f, 11.357f, 2.0f, 11.024f)
                verticalLineTo(12.001f)
                curveTo(2.0f, 12.277f, 1.776f, 12.501f, 1.5f, 12.501f)
                curveTo(1.224f, 12.501f, 1.0f, 12.277f, 1.0f, 12.001f)
                verticalLineTo(9.501f)
                curveTo(1.0f, 9.368f, 1.053f, 9.241f, 1.146f, 9.147f)
                curveTo(1.24f, 9.053f, 1.367f, 9.001f, 1.5f, 9.001f)
                horizontalLineTo(4.0f)
                curveTo(4.276f, 9.001f, 4.5f, 9.224f, 4.5f, 9.501f)
                curveTo(4.5f, 9.777f, 4.276f, 10.001f, 4.0f, 10.001f)
                horizontalLineTo(2.481f)
                curveTo(2.622f, 10.217f, 2.795f, 10.43f, 3.0f, 10.637f)
                curveTo(3.122f, 10.761f, 3.254f, 10.882f, 3.399f, 11.001f)
                close()
                moveTo(4.0f, 13.725f)
                verticalLineTo(13.861f)
                curveTo(4.0f, 14.056f, 4.113f, 14.233f, 4.29f, 14.315f)
                lineTo(8.952f, 16.466f)
                curveTo(9.617f, 16.773f, 10.383f, 16.773f, 11.048f, 16.466f)
                lineTo(15.71f, 14.315f)
                curveTo(15.887f, 14.233f, 16.0f, 14.056f, 16.0f, 13.861f)
                verticalLineTo(13.724f)
                curveTo(16.351f, 13.555f, 16.685f, 13.371f, 17.0f, 13.172f)
                verticalLineTo(13.861f)
                curveTo(17.0f, 14.446f, 16.66f, 14.977f, 16.129f, 15.223f)
                lineTo(11.467f, 17.374f)
                curveTo(10.536f, 17.804f, 9.464f, 17.804f, 8.533f, 17.374f)
                lineTo(3.871f, 15.223f)
                curveTo(3.34f, 14.977f, 3.0f, 14.446f, 3.0f, 13.861f)
                verticalLineTo(13.173f)
                curveTo(3.315f, 13.372f, 3.649f, 13.556f, 4.0f, 13.725f)
                close()
                moveTo(6.04f, 6.804f)
                curveTo(6.149f, 6.55f, 6.443f, 6.432f, 6.697f, 6.541f)
                lineTo(10.0f, 7.957f)
                lineTo(13.303f, 6.541f)
                curveTo(13.557f, 6.432f, 13.851f, 6.55f, 13.96f, 6.804f)
                curveTo(14.068f, 7.057f, 13.951f, 7.351f, 13.697f, 7.46f)
                lineTo(10.5f, 8.83f)
                verticalLineTo(11.001f)
                curveTo(10.5f, 11.277f, 10.276f, 11.501f, 10.0f, 11.501f)
                curveTo(9.724f, 11.501f, 9.5f, 11.277f, 9.5f, 11.001f)
                verticalLineTo(8.83f)
                lineTo(6.303f, 7.46f)
                curveTo(6.049f, 7.351f, 5.932f, 7.057f, 6.04f, 6.804f)
                close()
            }
        }
        .build()
        return _cubeRotate!!
    }

@Suppress("ObjectPropertyName")
private var _cubeRotate: ImageVector? = null

@Preview
@Composable
private fun CubeRotatePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.CubeRotate, contentDescription = "CubeRotate Icon")
    }
}

